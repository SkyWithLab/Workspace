
	import java.util.ArrayList;		//Arraylis와Scanner를 사용하겠다는 의미
	import java.util.Scanner;		//Arraylist동물목록 저장,Scanner사용자 입력받		

	// Model
	class Animal {		//이름, 종,, 나이를 저장할 변수 선언
		
	    private String name;
	    private String species;
	    private int age;

	    public Animal(String name, String species, int age) {
	        this.name = name;
	        this.species = species;
	        this.age = age;
	    } // 생성자 Animal객체를 만들 때 이름, 종, 나이를 넣어서 초기화

	    public String getName() { return name; }
	    public String getSpecies() { return species; }
	    public int getAge() { return age; }
	    //  프라이빗 으로막아둔, 변수를 직접접근이 어렵기 때문에,getter 메소드로 안전하게 가져옴

	    public void setSpecies(String species) { this.species = species; }
	    public void setAge(int age) { this.age = age; }
	//종, 나이를 수정 할 수 있는 메서드 setter
	    //이름은 아직 수정못함..////
	    public String toString() { // toString() 객체를 문자열로 보여주려고 불리는메서드
	        return "이름: " + name + ", 종: " + species + ", 나이: " + age;
	    }//Animal 객체를 문자열로 출력할 때 쓰임
	   // System.out,println(a); 하면,이름:냥냥이 종:강아지, 나이:3 이런식
	    }

	// View
	class AnimalView {		//View 클래스 정의
	    Scanner sc = new Scanner(System.in); //변수이름은sc , 
	    									//new Scanner(System.in)이제 키보드에서 들어오는 값을 읽어라  

	    public int menu() {
	        System.out.println("\n--- 동물병원 시스템 ---");
	        System.out.println("1. 동물 등록 (Create)");
	        System.out.println("2. 동물 목록 보기 (Read)");
	        System.out.println("3. 동물 정보 수정 (Update)");
	        System.out.println("4. 동물 삭제 (Delete)");
	        System.out.println("5. 종료");
	        System.out.print("선택: ");
	        return sc.nextInt();
	    }	//메뉴를 콘솔에 출력하고, 사용자 선택을 입력받아 반환
	    	//숫자 1-5를 입력하면 그 값이 run에서 사용

	    public String inputName() {
	        System.out.print("이름: ");
	        return sc.next(); 
	    }

	    public String inputSpecies() {
	        System.out.print("종: ");
	        return sc.next();
	    }

	    public int inputAge() {
	        System.out.print("나이: ");
	        return sc.nextInt();
	    }

	    public void showMsg(String msg) {
	        System.out.println(msg);
	    }
	}

	// Controller
	class AnimalController {
	    ArrayList<Animal> animals = new ArrayList<>();
	    AnimalView view = new AnimalView();

	    public void run() {
	        boolean run = true;
	        while (run) {
	            int choice = view.menu();
	            if (choice == 1) addAnimal();
	            else if (choice == 2) listAnimals();
	            else if (choice == 3) updateAnimal();
	            else if (choice == 4) deleteAnimal();
	            else if (choice == 5) run = false;
	            else view.showMsg("잘못된 선택입니다.");
	        }
	    }

	    private void addAnimal() {     		// 등록하는 부분
	        String name = view.inputName();
	        String species = view.inputSpecies();
	        int age = view.inputAge();
	        animals.add(new Animal(name, species, age));
	        view.showMsg("등록 완료!");
	    }

	    private void listAnimals() { // R		//동물정보 목록을 보여주는 부분
	        if (animals.isEmpty()) {
	            view.showMsg("등록된 동물이 없습니다.");
	        } else {
	            for (Animal a : animals) {
	                System.out.println(a);
	            }
	        }
	    }

	    private void updateAnimal() { // 수정하는 부분
	        String name = view.inputName();
	        for (Animal a : animals) {
	            if (a.getName().equals(name)) {
	                String newSpecies = view.inputSpecies();
	                int newAge = view.inputAge();
	                a.setSpecies(newSpecies);
	                a.setAge(newAge);
	                view.showMsg("수정 완료!");
	                return;
	            }
	        }
	        view.showMsg("해당 이름의 동물이 없습니다.");
	    }

	    private void deleteAnimal() { 			//삭제하는 부분
	        String name = view.inputName();
	        Animal removeAnimal = null;
	        for (Animal a : animals) {
	            if (a.getName().equals(name)) {
	                removeAnimal = a;
	                break;
	            }
	        }
	        if (removeAnimal != null) {
	            animals.remove(removeAnimal);
	            view.showMsg("삭제 완료!");
	        } else {
	            view.showMsg("해당 이름의 동물이 없습니다.");
	        }
	    }
	}

	// Main
	public class AnimalHospitalMVC {
	    public static void main(String[] args) {
	        AnimalController controller = new AnimalController();
	        controller.run();
	    }
	}