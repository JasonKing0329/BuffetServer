package com.app.buffet;


import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        save("1","010","030","010，020，012");
        testeq();
    }

    private static void testeq() {
        Float f=155.0f;
        String item="155.00";
        System.out.println(f);
        System.out.println(item);
        System.out.println(f.equals(Float.valueOf(item)));
    }

    /**
     * 将菜品信息的id信息进行拼装
     *
     * @param s
     * @param items
     * @return
     */
    private static String joinString(String s, ArrayList<String> items) {
        StringBuilder sb = new StringBuilder();
        boolean firstTime = false;
        for (String item : items) {
            if (!firstTime) {
                firstTime = true;
            } else {
                sb.append(s);
            }
            sb.append(item);
        }
        return sb.toString();
    }

    private static void save(String id, String from, String to, String noin) {
        String[] split = noin.split("，");
        List<Integer> list = new ArrayList<>();
        for(String str:split){
            list.add(Integer.valueOf(str));
        }
        int start = Integer.valueOf(from);
        int end=Integer.valueOf(to);
        for (int i=start;i<end+1;i++){
            if(list.contains(i)){
            }else {
                String str = String.format("%0"+from.length()+"d", i);
                System.out.println(str);
            }
        }
    }
}
