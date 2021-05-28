package co.yedam.numgame;

public class NumberGameApp {

	//컴퓨터가 임의의수를 생성
	int com;  //컴퓨터 만든 수 (1~10)
    int user; //사용자가 입력한 값
	
    
    void init() {
    	//난수(1~10)
    }
	//사용자가 수를 입력
    void input() {
    	//scanner를 이용해서 정수값 입력
    }
    
	//높다/낮다:false  답이면:true
    boolean confirm() {
    	//com과 user를 비교해서 같으면 true
    	//다르면 높다/낮다 출력하고 false 리턴
    }
    void start( ) {
    	init();
    	while(true) {
    		input();
    		if(comfirm()) {
    			break;
    		}
    	}
    }
    
}
