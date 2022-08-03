public class Robot
{
    public static void main(String args[])
    {
        int row=Integer.parseInt(args[0]);
        int column=Integer.parseInt(args[1]);
        char dirn=args[2].charAt(0);
        String cmd=args[3];
        for(int i=0;i<cmd.length();i++)
        {
           if(cmd.charAt(i)!='M')
           {
            dirn=cmd.charAt(i);
            continue;
           }
           else //for robot movement
           {
             if(dirn=='N'&&row>=1)
               row--;
             else if(dirn=='S'&&row<=2)
               row++;  
            else if(dirn=='W'&&column>=1)
                 column--;
            else if(dirn=='E'&&column<=3)
               column++;
           }
        }
        System.out.print("("+row+","+column+","+dirn+")");
        
    } 
}
