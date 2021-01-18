package _0104.autoComplete;


import java.util.HashMap;
import java.util.Objects;

public class AutoComplete {

    public int solution(String[] words) {
        int answer = 0;


        HashMap<String, _0104.autoComplete.Tree> roots = new HashMap<>();

        //단어들로 트리를 만듬
        for (String word : words) {
            String[] wordToken = word.split("");
            if (!roots.containsKey(wordToken[0])) {
                roots.put(wordToken[0], new _0104.autoComplete.Tree(wordToken[0]));

            }
            for (int i = 0; i < wordToken.length; i++) {
                _0104.autoComplete.Tree wordTree = roots.get(wordToken[0]);

                wordTree.add(wordToken[i]);
            }
            roots.get(wordToken[0]).addRootCount();
        }

        _0104.autoComplete.Tree test  = roots.get("g");
        for (int i=0;i<test.tree.length;i++){
            if (Objects.nonNull(test.tree[i])){
                System.out.println(test.tree[i].getData());
            }
        }

        for(String word : words){
            String[] wordToken = word.split("");
            answer += roots.get(wordToken[0]).cal(wordToken);
        }

        //트리를 만들었으면 자동완성을 만들어야지
        //자동완성을 판단하는 기준은?
        /*
        일단 자식노드가 두개 있으면 불가능
        사용된 갯수를 카운트해서 가지고 있다가
        카운트가 모두 1인 시점을 자동완성시점으로
        go gone guild
            g
          o   u
        n       i
      e           l
                    d
         */


        return answer;
    }

}
