package com.company;
import java.util.Scanner;

class Line{
    public void line()
    {
        for (int i=0; i<135; i++){
            System.out.print("_");
        }
        System.out.println();
    }
}
class Mathematics{
    public void matrix(){
        Scanner sc=new Scanner(System.in);
        Line L=new Line();
        int First [][]=new int[50][50];
        int Second [][]=new int[50][50];
        int product[][]=new int[50][50];
        int Addition[][]=new int[50][50];
        int Subtract[][]=new int[50][50];
        System.out.println("Enter your matrix row value:");
        int r=sc.nextInt();
        System.out.println("Enter your matrix column value:");
        int c= sc.nextInt();
        System.out.println("This matrix for A:");
        System.out.println("Enter your elements:");
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                System.out.print("Matrix ["+i+j+"]");
                First [i][j]=sc.nextInt();
            }
        }
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                System.out.print(First[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        L.line();
        System.out.println("This matrix for B:");
        System.out.println("Enter your elements:");
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                System.out.print("Matrix ["+i+j+"]");
                Second [i][j]=sc.nextInt();
            }
        }
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                System.out.print(Second[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                Addition[i][j]=First[i][j]+Second[i][j];
                Subtract[i][j]=First[i][j]-Second[i][j];
                product[i][j]=0;
                for (int k=1; k<=c; k++)
                {
                    product[i][j]+=First[i][k]*Second[k][j];
                }
            }
        }
        System.out.println();
        System.out.println("Product of matrix:");
        L.line();
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                System.out.print(product[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Addition of matrix:");
        L.line();
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                System.out.print(Addition[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Subtract of matrix:");
        L.line();
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                System.out.print(Subtract[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void basicmath(){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many value you can use:");
        int element[]=new int[5000];
        int add=0;
        int sub=0;
        int pro=1;
        float div=1f;
        int value= sc.nextInt();
        for (int i=1; i<=1; i++)
        {
            for (int j=1; j<=value; j++)
            {
                System.out.println("Enter your value " + j + ":");
                element[j] = sc.nextInt();
                add=add+element[j];
                pro=pro*element[j];
                element[1]=-1;
                sub=element[j]-sub;
                div=element[j]/div;
            }
            System.out.println(add);
            System.out.println(sub);
            System.out.println(pro);
            System.out.println(div);
        }
    }
    public void factorial(){
        long f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n= sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            f=f*i;
            System.out.println(f);
        }
    }
}
public class Main {

    public static void main(String[] args) {
	    Mathematics M=new Mathematics();
	    M.basicmath();

    }
}
