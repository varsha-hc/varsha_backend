public class CountVowels {
    public static void main(String[] args) {
        String s = "Hey Everyone";
        int count = 0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch =='a' || ch =='e' || ch== 'i' || ch == '0' ||ch== 'u' )
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
