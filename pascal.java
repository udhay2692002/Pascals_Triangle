public class pascal {

    public static void main(String[] args)
    {
      int i,j,s,c,n=10;
      for(i=0;i<n;i++)
      {
          for(s=0;s<n-i-1;s++)
          {
              System.out.print("\t"+' ');
          }
          c=1;
          for(j=0;j<=i;j++)
          {
              System.out.print("\t\t"+c);
              c=c*(i-j)/(j+1);
          }
          System.out.println();
      }
    }
}
