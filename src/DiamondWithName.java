class DiamondWithName{
    public static void main(String[] args)
    {
        int n=3;
        int space=n-1;
        int numStar=1;
        for(int i=0;i<n-1;i++)
        {
            for(int j=space;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=numStar;k>0;k--)
            {
                System.out.print("*");
            }

            space=space-1;
            numStar=numStar+2;
            System.out.print("\n");

        }

        System.out.println("Bill");
        space=space+1;
        numStar=numStar-2;
        for(int i=1;i<n;i++)
        {
            for (int j=space;j>0 ;j-- ) {
                System.out.print(" ");

            }
            for(int k=numStar;k>0;k--)
            {
                System.out.print("*");
            }
            space=space+1;
            numStar=numStar-2;
            System.out.print("\n");
        }

    }
}