package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalCharacterTypes {

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/118666
    */

    public String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        // R,T,F,C,M,J,A,N
        List<String> keyList = Arrays.asList("R", "T", "C", "F", "J", "M", "A", "N");

        // 맵. 키 할당
        for (String key : keyList) {
            map.put(key, 0);
        }

        // 질문의 개수 만큼 반복.
        for (int i = 0; i < survey.length; i++ ){
            // 질문 하나에 대한 처리.

            // 문자열 나누어 임시 배열에 할당.
            String[] prefer = survey[i].split("");
            // 선택에 따른 점수 할당.
            switch (choices[i]) {
                case 1: {
                    map.put(prefer[0], map.get(prefer[0]) + 3);
                    break;
                }
                case 2: {
                    map.put(prefer[0], map.get(prefer[0]) + 2);
                    break;
                }
                case 3: {
                    map.put(prefer[0], map.get(prefer[0]) + 1);
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    map.put(prefer[1], map.get(prefer[1]) + 1);
                    break;
                }
                case 6: {
                    map.put(prefer[1], map.get(prefer[1]) + 2);
                    break;
                }
                case 7: {
                    map.put(prefer[1], map.get(prefer[1]) + 3);
                    break;
                }
                // default:
            }
        }

        for (int i = 0; i < keyList.size(); i += 2) {
            // 출력을 위한 성격 유형을 담을 문자열 answer
            // map 에 적립된 점수 비교,
            answer += map.get(keyList.get(i)) > map.get(keyList.get(i + 1))
                    ? keyList.get(i)
                    : map.get(keyList.get(i)) == map.get(keyList.get(i + 1))
                    ? keyList.get(i)
                    : keyList.get(i + 1);
        }

        return answer;
    }
}
