import java.util.*;
class vowel
{
public static void main( String args[])
{
char alphabet;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the character : ");
alphabet=sc.next().charAt(0);
switch(alphabet)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':System.out.println("The character is vowel : "); break;
case 'b':
case 'c':
case 'd':
case 'f':
case 'g':
case 'h':
case 'j':
case 'k':
case 'l':
case 'm':
case 'n':
case 'p':
case 'q':
case 'r':
case 's':
case 't':
case 'v':
case 'w':
case 'x':
case 'y':
case 'z':System.out.println("The character is consonant : "); break;
default:System.out.println("Ivalid character : "); break;
}
}
}