class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        convert(sb, '*', '*', 'M', num / 1000);
        num = num % 1000;

        convert(sb,'M','D','C',num/100);
        num = num % 100;
        convert(sb,'C','L','X',num/10);
        num = num % 10;
        convert(sb,'X','V','I',num);

        return sb.toString();
    }

    public void convert(StringBuilder sb , char major,char middle,char minor , int val){
        if(val <=3){
            for(int i = 1 ; i <= val ; i++){
                sb.append(minor);
            }
        }
        else if(val == 4){
                sb.append(minor);
                sb.append(middle);
        }
        else if(val ==5){
                sb.append(middle);
        }
        else if( val <= 8){
                sb.append(middle);
                for(int i = 6 ; i <= val ; i++){
                sb.append(minor);
            }
        }
        else if(val==9){
                sb.append(minor);
                sb.append(major);

        }
    }
}