package client;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement

@XmlType(propOrder = {"LocalDate", "LocalTime", "recordTheSteps", "recordTheSign",})

public class Record {

    //add it we need
// Private Sring userEmail;
    private int row;
    private int col;
    private char sign;
    private LocalDate currentDate;
    private LocalTime currentTime;
    ArrayList<int[]> recordTheSteps = new ArrayList<>();
    ArrayList<Character> recordTheSign = new ArrayList<>();

//    static Record[] RecordArray = new Record[5];
//    static int countRecords = 0;
    public Record() {
    }

    public Record(int row, int col, char sign) {
        this.row = row;
        this.col = col;
        this.sign = sign;
    }

    @XmlElement
    public LocalDate getCurrentDate() {
        return currentDate;
    }

    @XmlElement
    public LocalTime getCurrentTime() {
        return currentTime;
    }

    @XmlElement
    public ArrayList<int[]> getRecordTheSteps() {
        return recordTheSteps;
    }

    @XmlElement
    public ArrayList<Character> getRecordTheSign() {
        return recordTheSign;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public char getSign() {
        return sign;
    }

    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setRecordTheSteps(ArrayList<int[]> recordTheSteps) {
        this.recordTheSteps = recordTheSteps;
    }

    public void setRecordTheSign(ArrayList<Character> recordTheSign) {
        this.recordTheSign = recordTheSign;
    }

    public void setclick(int row, int col, char sign) {

        recordTheSteps.add(new int[]{row, col});
        recordTheSign.add(sign);

    }
//  
//    public void addRecords(Record addNew) {
//          // i make it only 5
//        RecordArray[countRecords] = addNew;
//        countRecords++;
//        System.out.println(countRecords);
//        
//
//    }
}
//private void record(int row, int col, char sign) {
//
//        ArrayList<int[]> recordTheSteps = new ArrayList<>();
//        ArrayList<Character> recordTheSign = new ArrayList<>();
//
//    recordTheSteps.add(new int[]{row, col});
//        recordTheSign.add(sign);
//       
//
//    }
//                         newRecord is the instance
//ArrayList<Character> signs = newRecord.getRecordTheSign();
//                        System.out.println(signs);
//                        ArrayList<int[]> gameSteps = newRecord.getRecordTheSteps();
//                          for (int[] array : gameSteps) {
//                            System.out.println(Arrays.toString(array));
//                        }
