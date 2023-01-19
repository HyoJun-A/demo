# AWS Test

## AWS 시작
* aws 홈페이지 접속
* EC2 검색 후 인스턴스 생성
* 실제 사용하는 것이 아니기 때문에 무료로 사용
* Amazon Linux
* 인스턴스 유형 지정
* 키 생성
* 보안 메뉴 
* 인바운드(외부에서 들어오는 연결)규칙, 아웃바운드(외부로 나가는 연결)규칙 설정 | 기본은 SSH 22만 들어가 있음

## Puty
* PuTTYgen 실행
* "키 파일" Load를 통해서 로딩
* 정상 로딩 후 Save private key 클릭하여 파일로 저장
* Putty실행
* HostName을 EC2 인스턴트 퍼블릿 IPv4 DNS를 지정
* Connection - SSH - Auth 항목으로 이동하여 Private key file authenication에서 위에서 파일로 저장한 키 선택
* 실행
* ec2-user라는 이름으로 로그임

## Putty실행 후 설정
* 각종 필요한 것을 설치를 할 때에 sudo권한이 필요 할 수 있기 때문에 sudo -s 입력 후 시작
* java -version > java가 없을 경우
* sudo yum list | grep jdk (설치할 수 있는 jdk 확인)
* sudo yum install java-1.8.0-openjdk EX) java 8 일 경우 사용 다른 버전일경우에는 원하는 버전으로 설치
* sudo yum install java-1.8.0-openjdk-devel.x86_64 (javac 설치)

### git에 있는 프로젝트를 사용할 경우
* sudo yum install git (git 설치)
* 디렉토리 정리를 위하여 mkdir "디렉토리 이름" 을 사용하여 디렉토리 생성
* git clone "git project clone주소"
* git 파일로 이동 (cd "xx")
* pwd (clone한 파일 확인)
* sudo chmod 777 ./gradlew (gralew를 사용할 권한이 없기 때문에 권한을 강제로 변경)
* ./gradkew build를 사용하여 실행
* 실행이 정상적으로 되면 cd build / libs 이동 후 jar파일 확인
* jar파일이 확인될 경우에
* java -jar "jar 이름"으로 실행
* 

### 브라우저가 정상적으로 실행되는지 확인
* 퍼블릭 IPv4 DNS와 포트번호를 입력하여 브라우저에서 확인
* 퍼블릭 IPv4 DNS:8080
