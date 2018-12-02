package pl.com.rkulikowski.homework;

public class homework_18_11 {

    public static void main(String[] args) {
        System.out.println("* * * *        *        *           *        *          *  * * *    * * *  *     *  *     *    *  *  * ");
        System.out.println("      *       * *        *         *        * *         *  *        *      *     *  **    *    *  *  * ");
        System.out.println("      *      *   *        *       *        *   *        *  *        *      *     *  * *   *    *  *  * ");
        System.out.println("      *     *     *        *     *        *     *       *  * * *    * *    *     *  *  *  *    *  *  * ");
        System.out.println("      *    * * * * *        *   *        * * * * *      *      *    *      *     *  *   * *    *  *  * ");
        System.out.println("*     *   *         *        * *        *         *     *      *    *      *     *  *    **            ");
        System.out.println("* * * *  *           *        *        *           *    *  * * *    *      * * * *  *     *    *  *  * ");

        System.out.println();
        System.out.println();

        homework_18_11 obj = new homework_18_11();

        obj.jArray();
        obj.spaceArray();
        obj.aArray();

    }

    public void spaceArray(){
        String [][] spaceArray= new String[1][1];

        for(int i=0; i<spaceArray.length;i++){
            for (int j=0; j<spaceArray[i].length;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void jArray(){
        String [][] javaArray = new String[6][7];

        javaArray[0][0] = "*";
        javaArray[0][1] = "*";
        javaArray[0][2] = "*";
        javaArray[1][2] = "*";
        javaArray[2][2] = "*";
        javaArray[3][2] = "*";
        javaArray[4][2] = "*";
        javaArray[4][1] = "*";
        javaArray[4][0] = "*";
        javaArray[3][0] = "*";

        for (int i =0 ; i<javaArray.length;i++){
            for (int j= 0 ;j<javaArray[i].length; j++) {
                if (javaArray[i][j] == null)
                    javaArray[i][j] = " ";}
        }

        for (int i =0 ; i<javaArray.length;i++){
            for (int j= 0 ;j<javaArray[i].length; j++){
                System.out.print(javaArray[i][j]);
            }
            System.out.println();
        }

    }
    public void aArray(){
        String [][] javaArray = new String[6][7];

        javaArray[0][1] = "*";
        javaArray[1][0] = "*";
        javaArray[1][1] = "*";
        javaArray[1][2] = "*";
        javaArray[2][0] = "*";
        javaArray[2][2] = "*";
        javaArray[3][0] = "*";
        javaArray[3][1] = "*";
        javaArray[3][2] = "*";
        javaArray[4][0] = "*";
        javaArray[4][2] = "*";

        for (int i =0 ; i<javaArray.length;i++){
            for (int j= 0 ;j<javaArray[i].length; j++) {
                if (javaArray[i][j] == null)
                    javaArray[i][j] = " ";}
        }

        for (int i =0 ; i<javaArray.length;i++){
            for (int j= 0 ;j<javaArray[i].length; j++){
                System.out.print(javaArray[i][j]);
            }
            System.out.println();
        }

    }

}
