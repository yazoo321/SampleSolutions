package samples.others.string_compression;


// The Challenge
//In this exercise, you’re going to decompress a compressed string.
//
//Your input is a compressed string of the format number[string] and the decompressed output form should be the string written number times. For example:
//
//The input
//
//3[abc]4[ab]c
//
//Would be output as
//
//abcabcabcababababc


public class BasicStringCompression {

    private class CompressedData {
        Integer times;
        StringBuilder sb;

        void CompressedData() {
            sb = new StringBuilder();
            times = 1;
        }

        public int getTimes() {
            return times;
        }

        public StringBuilder getData() {
            return sb;
        }

        public void setData(StringBuilder sb) {
            this.sb = sb;
        }

        public void setTimes(int times) {
            this.times = times;
        }
    }

    // example input 3[abc]4[ab]c
    public String decompress(String input) {
        // traverse string to evaluate
        // - number of times (end is '[')
        // - string to print (end is ']')

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            CompressedData cd = new CompressedData();
            i = getNextNumber(i, input, cd);
            i = getNextString(i, input, cd);

            for (int x = 0; x < cd.getTimes(); x++) {
                sb.append(cd.getData());
            }
        }

        return sb.toString();
    }

    // consider using regex here.

    private int getNextNumber(int i, String input, CompressedData cd) {
          int number = 0;
          boolean isDefault = true;

          for (;i<input.length(); i++) {
              Character c = input.charAt(i);
              if (Character.isDigit(c)) {
                  isDefault = false;
                  number = number*10 + (c - '0');
              } else if (c.equals('[')) {
                  continue;
              } else {
                  break;
              }
          }
          number = isDefault ? 1 : number;
          cd.setTimes(number);

          return i;
    }

    private int getNextString(int i, String input, CompressedData cd) {
       StringBuilder sb = new StringBuilder();

       for (; i < input.length(); i++) {
           Character c = input.charAt(i);
           if (Character.isLetter(c)) {
               sb.append(c);
           }
           else {
               break;
           }
       }
       cd.setData(sb);

       return i;
    }


}
