package practice.basic;

public class Basic3Loop {

    public static void main(String[] args) {
        int[] intArray = {1, 5, 3, 6, 3, 6, 2, 7, 10};

        System.out.println("==== 일반적인 for 루프 ====");
        for (int i=0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println();

        System.out.println("==== 신세대 for 루프 ===="); // 하는짓은 아예 같음. 걍 문법이 좀 더 스타일리쉬 함
        for (int element : intArray) {
            System.out.println(element);
        }
        System.out.println();

        System.out.println("==== if 랑 같이 쓰는 for 루프");
        for (int element : intArray) {
            if (element > 5) {
                System.out.println(element + "은 5보다 큼");
            }
            else {
                System.out.println(element + "은 5보다 크지 않음");
            }
        }

    }

}
