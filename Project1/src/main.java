public class Project1 
{
   public static void main() 
   {
	    int x = 0;
		int y = 1;
		y++;
		int z = x + y;
   }
   
   void methAddition(int x, int y)
   {
	   int z = x+y;
	   return z;
   }
   
   void methMultip(int x, int y)
   {
	   int z = x*y + 1;
	   z--;
	   return z + 1;
   }
   
   void methSub(int x, int y)
   {
	   return x-y;
   }
}