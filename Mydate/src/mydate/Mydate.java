package mydate;

public class Mydate {
    private static final int MIN_YEAR  = 1;
    private static final int MAX_YEAR  = 9999;

    private static final int MIN_MONTH = 1;  
    private static final int MAX_MONTH = 12; 
    private int year;
    private int month;
    private int day;


    private String[] strMonths    = {"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private String[] strDays      = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
    
    //private String[] weekday      = {"Thu 2", "Thu 3", "Thu 4","Thu 5", "Thu 6", "Thu 7", "Chu nhat"};
    
    private String[] strCan       = {"Canh" , "Tan", "Nham" , "Quy", "Giap" , "At" , "Binh" , "Dinh", "Mau", "Ky"};
    
    private String[] strChi       = {"Than", "Dau", "Tuat", "Hoi", "Ty", "Suu", "Dan", "Mao", "Thin", "Ty", "Ngo", "Mui"};  

    private static final int[] daysInMonths            = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};    
    private static final int[] leapYearMonthNumbers    = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

//    private boolean isPreviousDayOperation   = false;
//    private boolean isPreviousMonthOperation = false;

  
     public Mydate(int year, int month, int day) {
        setDate(year, month, day);
    }
   
    public void setDate(int year, int month, int day)
    {
        if (! isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year  = year;
        this.month = month;
        this.day   = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year)
    {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month)
    {
        if (month < MIN_MONTH || month > MAX_MONTH) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) 
    {
        // int dayMax = daysInMonths[month-1] + (isLeapYear(year) && month == 2 ? 1 : 0 );
        if (1 > day || day > getMonthLastDay(this.year, this.month)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }
    
    //công thưc tính toán thứ trong tuần
    public int get_day(int year,int month,int day ){
        int JMD;
        JMD = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) + (365 * (year + 4800 - ((14 - month) / 12))) +
          ((year + 4800 - ((14 - month) / 12)) / 4) - 
          ((year + 4800 - ((14 - month) / 12)) / 100) + 
          ((year + 4800 - ((14 - month) / 12)) / 400)  - 32045) % 7;
        return JMD;
    }
    
    //thứ trong tuần.
    public static int getDayOfWeek(int year, int month, int day)
    {
        if (!isValidDate(year, month, day)) {
            return -1;
        }

        // 1. Dựa trên hai chữ số đầu tiên của năm, lấy số từ bảng 'thế kỷ'
        // ma thế ky 1700(4) ,  1800(2) , 1900(0) ,2000(6), 2100(4) , 2200(2), 2300(0);
        int magicCenturyNumber = 6 - 2*((year / 100) % 4);
        
        // 2. Thêm vào hai chữ số cuối của năm.
        int lastTwoDigitsOfYear = year % 100;
        
        // 3. Thêm vào 'hai chữ số cuối của năm chia cho 4, cắt bớt phần phân số'.
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        
        // 4.Thêm vào số lượng thu được từ bảng tháng.
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month-1] : nonLeapYearMonthNumbers[month-1];
        
        // 5. thêm vào số lượng ngày..
        int magicDayNumber = day;
        
        // 6.Mô-đun tổng 7 cung cấp cho ngày trong tuần, trong đó 0 cho SUN, 1 cho MON, ..., 6 cho SAT.
        return (  magicCenturyNumber + lastTwoDigitsOfYear  + magicYearNumber    + magicMonthNumber + magicDayNumber) % 7; 
    }
    
    public  int getCan(int year,int month,int day){
        if (!isValidDate(year, month, day)) {
            return -1;
        } 
        int magicCenturyNumberCan = year % 10;
        
        return magicCenturyNumberCan;
    }
    
    public  int getChi(int year,int month,int day){
        if (!isValidDate(year, month, day)) {
            return -1;
        } 
        int magicCenturyNumberChi = year % 12;
        
        return magicCenturyNumberChi;
    }
    
    
    
      //kiểm tra năm nhuân.
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    
    public static int getMonthLastDay(int year, int month) {
        return daysInMonths[month-1] + (isLeapYear(year) && month == 2 ? 1 : 0 );
    }

    public static boolean isValidDate(int year, int month, int day) {

        return (MIN_YEAR  <= year   && year  <= MAX_YEAR) && (MIN_MONTH <= month  && month <= MAX_MONTH) && (1 <= day    && day   <= getMonthLastDay(year, month));
    }
    

    public Mydate nextDay()
    {
        int maxDay = getMonthLastDay(year, month);
        if (maxDay == day && MAX_MONTH == month && MAX_YEAR == year) {
            return this;
        }

        if (maxDay == day && MAX_MONTH == month) {
            setDate(year+1, MIN_MONTH, 1);
            return this;
        }

        if (maxDay == day) {
            setDate(year, month+1, 1);
            return this;
        }
        
        setDate(year, month, day+1);
        return this;
    }
    
    public Mydate nextMonth()
    {
        if (MAX_MONTH == month && MAX_YEAR == year) {
            return this;
        }

        int maxDay = (MAX_MONTH == month) ? getMonthLastDay(year+1, MIN_MONTH) : getMonthLastDay(year, month+1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        }
        else if (day > maxDay) {
            maxDay = maxDay;
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        if (MAX_MONTH == month) {
            setDate(year+1, MIN_MONTH, maxDay);
            return this;
        }

        setDate(year, month+1, maxDay);
        return this;
    }

    public Mydate nextYear()
    {
        if (MAX_YEAR == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year+1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        }
        else if (day > maxDay) {
            maxDay = maxDay;
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year+1, month, maxDay);
        return this;
    }
    
    
    public Mydate previousDay()
    {
        if (1 == day && MIN_MONTH == month && MIN_YEAR == year) {
            return this;
        }

        if (1 == day && MIN_MONTH == month) {
            setDate(year-1, MAX_MONTH, getMonthLastDay(year-1, MAX_MONTH));
            return this;
        }

        if (1 == day) {
            setDate(year, month-1, getMonthLastDay(year, month-1));
            return this;
        }
        
        setDate(year, month, --day);
        return this;
    }

    public Mydate previousMonth()
    {
        if (MIN_MONTH == month && MIN_YEAR == year) {
            return this;
        }

        int maxDay = (MIN_MONTH == month)
                ?   getMonthLastDay(year-1, MAX_MONTH)
                :   getMonthLastDay(year, month-1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        }
        else if (day > maxDay) {
            maxDay = maxDay;
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        if (MIN_MONTH == month) {
            setDate(year-1, MAX_MONTH, maxDay);
            return this;
        }

        setDate(year, month-1, maxDay);
        return this;
    }

    public Mydate previousYear()
    {
        if (MIN_YEAR == year) {
            return this;
        }
        int maxDay = getMonthLastDay(year-1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        }
        else if (day > maxDay) {
            maxDay = maxDay;
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year-1, month, maxDay);
        return this;
    }

    /**
     * @return date in "xxxday d mmm yyyy", e.g., "Tuesday 14 Feb 2012" format.
     */
    public String toString() {
        int weekDay = getDayOfWeek(year, month, day);
       // int weekday =  get_day(year, month, day);
        int yearCan =  getCan(year, month, day);
        int yearChi =  getChi(year, month, day);
        return String.format("%1$s %2$d %3$s %4$d %5$s %6$s", strDays[weekDay], day, strMonths[month-1],year, strCan[yearCan],strChi[yearChi]);
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (other == this) 
            return true;
        if (!(other instanceof Mydate))
            return false;
    
        Mydate otherMydate = (Mydate) other;
        return (this.year  == otherMydate.getYear())
            && (this.month == otherMydate.getMonth())
            && (this.day   == otherMydate.getDay());
    }
    
    

}
