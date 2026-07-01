public class CharacterStatistics {
    public static void main(String[] args) {
        String text = "WelCoME To HaPPy CheNNAI 600035 ToP Metro City";

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else if (ch == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Total Length: " + text.length());
        System.out.println("Uppercase: " + upperCount);
        System.out.println("Lowercase: " + lowerCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Spaces: " + spaceCount);
    }
}