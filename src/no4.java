public class no4 {
    static class Name{
        public void checkUserName(String name1, String name2){
            if(name1.equalsIgnoreCase(name2)){
                System.out.print("Выберите другого пользователя");
            } else {
                System.out.print("Отличный выбор!\nВаше имя имеет длину " + name2.length() + " символов");
                System.out.println("\nА без пробелов ваше имя занимает " + (name2.replaceAll(" ","")).length() + " символов");
            }
        }
    }
    public static void main(String[] args) {
        Name name = new Name();
        String name1 = "Иван Иванов";
        String name2 = "Вован Иванов Иванович";
        name.checkUserName(name1,name2);




        }
    }


