package _0104.autoComplete;

import java.util.Objects;

class Tree {

    private String rootString;
    public Node[] tree;

    public Tree(String rootString) {
        this.rootString = rootString;
        tree = new Node[1000000];
        tree[0] = new Node(rootString);
    }

    public String getRootString() {
        return rootString;
    }

    public void add(String data) {
        //루트노드부터 탐색, 같은 문자가 있는지 확인
        //같은 문자가 있을 경우 한단계 더 내려감
        //빈경우 일때까지 내려가고, 빈 경우 노드를 추가
        int index = 0;
        int left, right;

        while (true) {
            left = getLeftChildIndex(index);
            right = getRightChildIndex(index);
            //왼쪽이나 오른쪽에 같은 문자가 있을 경우 아래로 내려감
            if (Objects.nonNull(tree[left]) && tree[left].getData().equals(data)) {
                index = left;
                tree[left].count++;
            } else if (Objects.nonNull(tree[right]) && tree[right].getData().equals(data)) {
                index = right;
                tree[right].count++;
            }
            //없는 경우 문자를 추가하고 빠져나감
            else {
                if (Objects.nonNull(tree[left])){
                    tree[left] = new Node(data);
                    tree[left].count++;
                }
                else{
                    tree[right] = new Node(data);
                    tree[right].count++;
                }
                break;
            }
        }
    }

    public int cal(String[] tokens){
        int count = 0;

        int index = 0;
        int tokenIndex = 0;
        while(true){
            if (tokenIndex >= tokens.length-1){
                break;
            }
            count++;
            Node target = tree[index];
            if (target.count > 1){
                Node left = tree[getLeftChildIndex(index)];
                Node right = tree[getRightChildIndex(index)];

//                System.out.println("left index "+getLeftChildIndex(index)+" right index "+getRightChildIndex(index)+" node "+target.getData() + " count "+target.count);

                if (Objects.nonNull(left) && left.getData().equals(tokens[tokenIndex+1])){
                    index = getLeftChildIndex(index);
                    tokenIndex++;
                }
                if (Objects.nonNull(right) && right.getData().equals(tokens[tokenIndex])){
                    index = getRightChildIndex(index);
                    tokenIndex++;
                }
            }
            if (target.count == 1){
                System.out.println("second in"+target.getData());
                break;
            }
        }


        return count;
    }

    public void addRootCount(){
        tree[0].count++;
    }


    private int getRightChildIndex(int index) {
        return index * 2 + 2;
    }

    private int getLeftChildIndex(int index) {
        return index * 2 + 1;
    }
}
