public class duplicaterecursion {
    public static void recursionduplicate (String str,int idx,StringBuilder newstr,boolean[]map){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(idx);
        if(map[currentchar-'a']==true){
            recursionduplicate(str, idx+1, newstr, map);
        }
        else{
            map[currentchar-'a']=true;
            newstr.append(currentchar);
            recursionduplicate(str, idx+1, newstr, map);

        }

    }
    public static void main(String[] args) {
        boolean[]map= new boolean[26];
        String str = "appnnacollege";
        recursionduplicate(str, 0, new StringBuilder(), map);

        
        
    }
    
    
}
