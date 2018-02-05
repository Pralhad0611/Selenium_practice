package Main.Java;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelRead {

    FileInputStream f,f1,f2;
    FileOutputStream F0Cargo,FOParticular,FOVessel;
    XSSFWorkbook wb;
    XSSFSheet st;
    XSSFCell email,pwd;
    private int rows;
    String  filelocation = System.getProperty("user.dir");
    int i = 1, j = 1;

    public FileInputStream getF() {
        return f;
    }

    public void setF(FileInputStream f) {
        this.f = f;
    }

    public FileInputStream getF1() {
        return f1;
    }

    public void setF1(FileInputStream f1) {
        this.f1 = f1;
    }

    public FileInputStream getF2() {
        return f2;
    }

    public void setF2(FileInputStream f2) {
        this.f2 = f2;
    }

    public FileOutputStream getF0Cargo() {
        return F0Cargo;
    }

    public void setF0Cargo(FileOutputStream f0Cargo) {
        F0Cargo = f0Cargo;
    }

    public FileOutputStream getFOParticular() {
        return FOParticular;
    }

    public void setFOParticular(FileOutputStream FOParticular) {
        this.FOParticular = FOParticular;
    }

    public FileOutputStream getFOVessel() {
        return FOVessel;
    }

    public void setFOVessel(FileOutputStream FOVessel) {
        this.FOVessel = FOVessel;
    }

    public XSSFWorkbook getWb() {
        return wb;
    }

    public void setWb(XSSFWorkbook wb) {
        this.wb = wb;
    }

    public XSSFSheet getSt() {
        return st;
    }

    public void setSt(XSSFSheet st) {
        this.st = st;
    }

   public XSSFCell getEmail() {
        return email;
    }

    public void setEmail(XSSFCell email) {
        this.email = email;
    }

    public XSSFCell getPwd() {
        return pwd;
    }

    public void setPwd(XSSFCell pwd) {
        this.pwd = pwd;
    }


    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public ExcelRead() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public ExcelRead(FileInputStream f, FileInputStream f1, FileInputStream f2, FileInputStream fCargo, FileInputStream fParticular, FileOutputStream f0Cargo, FileOutputStream FOParticular, XSSFWorkbook wb, XSSFWorkbook wb1, XSSFWorkbook wb2, XSSFWorkbook wb3, XSSFWorkbook wbCargo, XSSFWorkbook wbParticular, XSSFSheet st, XSSFSheet st1, XSSFSheet st2, XSSFSheet stCargo, XSSFSheet stParticular, XSSFCell email, XSSFCell comapny, XSSFCell comapnyperson, XSSFCell pwd, XSSFCell to, XSSFCell KAttn, XSSFCell berth_Anchorage, XSSFCell MV, XSSFCell operation, XSSFCell cargo, XSSFCell cargo_weight, XSSFCell ex_Rate, XSSFCell s_Tax, XSSFCell freight_Tax, XSSFCell voyage, XSSFCell levy, XSSFCell particularName, int rows, int i, int j, int rowss, int i1, int j1, int particularNameI, int particularNameJ, int statusI, int statusJ)
    {
        this.f = f;
        this.f1 = f1;
        this.f2 = f2;
    }



    public void ExcelReading()throws Exception{
        String filepath = filelocation+ File.separator+"Docs_files"+File.separator+"LoginCredentials.xlsx";
        System.out.println(filepath);
        f= new FileInputStream(filepath);
        // f = new FileInputStream("F:\\Projects\\OnGitProjects\\Selenium_Test\\Docs_files\\LoginCredentials.xlsx");


        wb = new XSSFWorkbook(f);
        st=wb.getSheetAt(0);

        int i=0,j=1;
        int rows=st.getLastRowNum();

        //System.out.println(rows);
        setEmail(st.getRow(i).getCell(j));

        setPwd(st.getRow(i+1).getCell(j));
        System.out.println(st.getRow(i+1).getCell(j));


    }
}
