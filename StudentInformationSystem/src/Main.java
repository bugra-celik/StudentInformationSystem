public class Main {
    public static void main(String[] args) {
   Teacher t1 = new Teacher("Mahmut hoca","555","TRH");
   Teacher t2 = new Teacher("GRAHAM BELL","000","FZK");
   Teacher t3 =new Teacher("Külyutmaz","111","BIO");

   Course tarih = new Course("Tarih","101","TRH");
   Course tarihQuiz = new Course("Tarih","101","TRH");
   tarih.addTeacher(t1);
   Course fizik = new Course("Fizik","102","FZK");
   Course fizikQuiz = new Course("Fizik","102","FZK");
   fizik.addTeacher(t2);
   Course biyo = new Course("biyoloji","101","BIO");
   Course biyoQuiz = new Course("biyoloji","101","BIO");
   biyo.addTeacher(t3);

   Student s1 = new Student("X","123","4",tarih,fizik,biyo,tarihQuiz,fizikQuiz,biyoQuiz);
   s1.addBulkExamNote(100,78,50);
   s1.addBulkQuizNote(90,45,65);
   s1.isPass();

   Student s2 = new Student("Y","444","4",tarih,fizik,biyo,tarihQuiz,fizikQuiz,biyoQuiz);
   s2.addBulkExamNote(55,72,34);
   s2.addBulkQuizNote(20,20,40);
   s2.isPass();

    }
}
