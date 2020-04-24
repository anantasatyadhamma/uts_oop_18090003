/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_18090003;
import java.util.*;
/**
 *
 * @author Anan
 */
public class Operasi {
    
    private static List<Data> listData = new LinkedList<Data>();

    public static void addData(Data data) {
        listData.add(data);
    }

    public static void editData(Data data, int index) {
        listData.set(index, data);
    }

    public static void removeData(int index) {
        listData.remove(index);
    }

    public static List<Data> getListData() { return listData; }


}
