public class MainClass {
    public static void main(String[] args) {
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Сизарев", "89646283645");
        phonebook.add("Сизарев", "89646283545");
        phonebook.add("Трамп", "89646283678");
        phonebook.add("Сидоров", "8996283645");
        phonebook.add("Сизарев", "89656483645");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Сизарев");
        System.out.println(phonebook.get("Сизарев"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Трамп"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Сизарев", "89646283645");
        System.out.println("Сизарев");
        System.out.println(phonebook.get("Сизарев"));
    }
}
