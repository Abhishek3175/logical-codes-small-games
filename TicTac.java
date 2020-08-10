import java.util.*;
public class TicTac
{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char y=' ';
        int l=0,j=1;
        int k,j1,a2,a1;
        char a4;
        char arr[][]=new char[4][4];
        for(int f=1;f<=3;f++){
            for(int s=1;s<=3;s++){
                arr[f][s]=' ';}}
        System.out.println("Enter:   S for playing against computer");
        System.out.println("         M for multiplayer");
        a4=sc.next().charAt(0);
        a4=Character.toUpperCase(a4);
        for(int i=1;i<=9;i++){
            if(a4=='M'||(a4=='S'&&(i%2!=0||l==1))){
                System.out.println();
                System.out.println("      |     |     ");
                System.out.println("   "+arr[1][1]+"  |  "+arr[1][2]+"  |  "+arr[1][3]+"  ");
                System.out.println(" _____|_____|_____");
                System.out.println("      |     |     ");
                System.out.println("   "+arr[2][1]+"  |  "+arr[2][2]+"  |  "+arr[2][3]+"  ");
                System.out.println(" _____|_____|_____");
                System.out.println("      |     |     ");
                System.out.println("   "+arr[3][1]+"  |  "+arr[3][2]+"  |  "+arr[3][3]+"  ");
                System.out.println("      |     |     ");
                System.out.println();
                System.out.println();}
            System.out.println();
            if(l==1){
                System.out.println(y+" is the winner!!!");
                System.exit(0);}

            if(i%2==0){
                y='O';
                j=2;}
            else{
                y='X';
                j=1;}

            if(a4=='M')
                System.out.println("Player "+j+" ("+y+") :");
            if(a4=='M'||(a4=='S'&&i%2!=0)){
                System.out.println("Enter row and column:");
                int r=sc.nextInt();
                int c=sc.nextInt();
                System.out.println();
                if(arr[r][c]=='X'||arr[r][c]=='O')
                    System.out.println("invalid box");
                else
                    arr[r][c]=y;}


            if(a4=='S'){      //computer's input code block while playing against computer
                if(i%2==0){
                    a2=0;

                    outer:
                    for(k=1;k<4;k++){
                        inner:
                        for(j1=1;j1<3;j1++){
                            if(j1==1)
                                a1=3;
                            else
                                a1=1;
                            if(arr[k][j1]==arr[k][j1+1]&&arr[k][j1+1]=='O'&&arr[k][a1]==' '){
                                arr[k][a1]='O';
                                a2=1;
                                break outer;}
                            if(arr[j1][k]==arr[j1+1][k]&&arr[j1][k]=='O'&&arr[a1][k]==' '){
                                arr[a1][k]='O';
                                a2=1;
                                break outer;}
                        }
                        if(arr[k][1]==arr[k][3]&&arr[k][1]=='O'&&arr[k][2]==' '){
                            arr[k][2]='O';
                            a2=1;
                            break outer;}
                        if(arr[1][k]==arr[3][k]&&arr[1][k]=='O'&&arr[2][k]==' '){
                            a2=1;
                            break outer;}
                    }
                    if(a2!=1){
                        if(arr[1][1]==arr[2][2]&&arr[1][1]=='O'&&arr[3][3]==' ')
                            arr[3][3]='O';
                        else if(arr[3][3]==arr[2][2]&&arr[3][3]=='O'&&arr[1][1]==' ')
                            arr[1][1]='O';
                        else if(arr[1][1]==arr[3][3]&&arr[1][1]=='O'&&arr[2][2]==' ')
                            arr[2][2]='O';
                        else if(arr[1][3]==arr[2][2]&&arr[1][3]=='O'&&arr[3][1]==' ')
                            arr[3][1]='O';
                        else if(arr[3][1]==arr[2][2]&&arr[3][1]=='O'&&arr[1][3]==' ')
                            arr[1][3]='O';
                        else if(arr[1][3]==arr[3][1]&&arr[1][3]=='O'&&arr[2][2]==' ')
                            arr[2][2]='O';
                        else
                            a2=0;}


                    if(a2!=1){
                        oute:
                        for(k=1;k<4;k++){
                            inne:
                            for(j1=1;j1<3;j1++){
                                if(j1==1)
                                    a1=3;
                                else
                                    a1=1;
                                if(arr[k][j1]==arr[k][j1+1]&&arr[k][j1+1]=='X'&&arr[k][a1]==' '){
                                    arr[k][a1]='O';
                                    a2=1;
                                    break oute;}
                                if(arr[j1][k]==arr[j1+1][k]&&arr[j1][k]=='X'&&arr[a1][k]==' '){
                                    arr[a1][k]='O';
                                    a2=1;
                                    break oute;}
                            }
                            if(arr[k][1]==arr[k][3]&&arr[k][1]=='X'&&arr[k][2]==' '){
                                arr[k][2]='O';
                                a2=1;
                                break oute;}
                            if(arr[1][k]==arr[3][k]&&arr[1][k]=='X'&&arr[2][k]==' '){
                                arr[2][k]='O';
                                a2=1;
                                break oute;}
                        }
                        if(a2!=1){
                            if(arr[1][1]==arr[2][2]&&arr[1][1]=='X'&&arr[3][3]==' '){
                                arr[3][3]='O';
                                a2=1;}
                            else if(arr[3][3]==arr[2][2]&&arr[3][3]=='X'&&arr[1][1]==' '){
                                arr[1][1]='O';
                                a2=1;}
                            else if(arr[1][1]==arr[3][3]&&arr[1][1]=='X'&&arr[2][2]==' '){
                                arr[2][2]='O';
                                a2=1;}
                            else if(arr[1][3]==arr[2][2]&&arr[1][3]=='X'&&arr[3][1]==' '){
                                arr[3][1]='O';
                                a2=1;}
                            else if(arr[3][1]==arr[2][2]&&arr[3][1]=='X'&&arr[1][3]==' '){
                                arr[1][3]='O';
                                a2=1;}
                            else if(arr[1][3]==arr[3][1]&&arr[1][3]=='X'&&arr[2][2]==' '){
                                arr[2][2]='O';
                                a2=1;}
                            else
                                a2=0;}
                    }
                    if(a2!=1){
                        if((arr[1][1]!='X'||arr[3][3]!='X')&&(arr[1][3]!='X'||arr[3][1]!='X')){
                            if(arr[2][2]==' ')
                                arr[2][2]='O';
                            else if(arr[1][1]==' ')
                                arr[1][1]='O';
                            else if(arr[1][3]==' ')
                                arr[1][3]='O';
                            else if(arr[3][1]==' ')
                                arr[3][1]='O';
                            else if(arr[3][3]==' ')
                                arr[3][3]='O';}
                        else if(arr[2][1]==' ')
                            arr[2][1]='O';
                        else if(arr[1][2]==' ')
                            arr[1][2]='O';
                        else if(arr[2][3]==' ')
                            arr[2][3]='O';
                        else if(arr[3][2]==' ')
                            arr[3][2]='O';

                    }}}






            if((arr[1][1]==arr[1][2]&&arr[1][2]==arr[1][3]&&arr[1][3]=='X')||(arr[2][1]==arr[2][2]&&arr[2][2]==arr[2][3]&&arr[2][3]=='X')||(arr[3][1]==arr[3][2]&&arr[3][2]==arr[3][3]&&arr[3][3]=='X')||(arr[1][1]==arr[2][1]&&arr[2][1]==arr[3][1]&&arr[3][1]=='X')||(arr[1][2]==arr[2][2]&&arr[2][2]==arr[3][2]&&arr[3][2]=='X')||(arr[1][3]==arr[2][3]&&arr[2][3]==arr[3][3]&&arr[3][3]=='X')||(arr[1][1]==arr[2][2]&&arr[2][2]==arr[3][3]&&arr[3][3]=='X')||(arr[1][3]==arr[2][2]&&arr[2][2]==arr[3][1]&&arr[3][1]=='X')){
                l=1;
                continue;}
            if((arr[1][1]==arr[1][2]&&arr[1][2]==arr[1][3]&&arr[1][3]=='O')||(arr[2][1]==arr[2][2]&&arr[2][2]==arr[2][3]&&arr[2][3]=='O')||(arr[3][1]==arr[3][2]&&arr[3][2]==arr[3][3]&&arr[3][3]=='O')||(arr[1][1]==arr[2][1]&&arr[2][1]==arr[3][1]&&arr[3][1]=='O')||(arr[1][2]==arr[2][2]&&arr[2][2]==arr[3][2]&&arr[3][2]=='O')||(arr[1][3]==arr[2][3]&&arr[2][3]==arr[3][3]&&arr[3][3]=='O')||(arr[1][1]==arr[2][2]&&arr[2][2]==arr[3][3]&&arr[3][3]=='O')||(arr[1][3]==arr[2][2]&&arr[2][2]==arr[3][1]&&arr[3][1]=='O')){
                l=1;
                continue;}
        }
        System.out.println(" IT'S A DRAW");}




}                    
                    
                
        
