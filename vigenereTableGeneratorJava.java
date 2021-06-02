public class vigenereTableGeneratorJava
{
	public static void main(String[] args) {
		char[][] vigenereTable = new char[26][26];
        for(int i = 0; i<=25; i++){
            int inc = 0;
            for(int j = 0; j<=25; j++){
                if(i+65+inc >90){
                    vigenereTable[i][j] = (char)((i+65+inc)-26);
                    inc++;
                }
                else{
                    vigenereTable[i][j] = (char)(i+65+inc);
                    inc++;   
                }
            }
        }
        for(int i = 0; i<=25; i++){
            for(int j = 0; j<=25; j++){
                System.out.print(vigenereTable[i][j]);
            }
            System.out.print("\n");
        }
	}
}