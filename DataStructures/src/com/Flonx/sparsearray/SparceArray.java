package com.Flonx.sparsearray;



/**
 * @Auther:Flonx
 * @Date:2021/1/15 - 01 - 15 - 11:16
 * @Description: com.Flonx.sparsearray
 * @Version: 1.0
 */
public class SparceArray {
    public static void main(String[] args) {
//        创建一个原始的二维数组11*11
//        0:表示没有棋子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
////        输出原始的二维数组
//        for(int[] row:chessArr1){
//            for (int data:row){
//                System.out.printf("%d\t",data);
//            }
//            System.out.println();
//        }

//        将二维数组转换成稀疏数组
//        1.先遍历二维数组得到非零数据的个数
        int sum = 0;
        for(int i = 0;i<chessArr1.length;i++){
            for(int j = 0;j<11;j++){
                if(chessArr1[i][j] != 0){
                    sum ++;
                }
            }
        }

//        创建对应的稀疏数组
        int sparceArr[][] = new int[sum+1][3];
//        给稀疏数组赋值
        sparceArr[0][0] = 11;
        sparceArr[0][1] = 11;
        sparceArr[0][2] = sum;

//        遍历二维数组,将非零的值存放到稀疏数组中
        int count = 1;
        for(int i = 0;i<11;i++){
            for(int j = 0 ;j<11;j++){
                if(chessArr1[i][j] != 0){
                    sparceArr[count][0] = i;
                    sparceArr[count][1] = j;
                    sparceArr[count][2] = chessArr1[i][j];
                    count ++;

                }
            }
        }//for i

//        输出稀疏数组的形式
        for(int[] row:sparceArr){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

//        将稀疏数组转换成二维数组
//        1.根据第一行的行和列创建对应的行和列,for循环value次
//        2.将二维数组中对应每行的坐标所对应的值赋给二维数组
        int[][] chessArr2 = new int[sparceArr[0][0]][sparceArr[0][1]];
        for(int i = 0;i<sparceArr[0][2];i++){
            chessArr2[sparceArr[i+1][0]][sparceArr[i+1][1]] = sparceArr[i+1][2];
        }
        for(int[] row:chessArr2){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

    }
}
