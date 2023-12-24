STEP4_스프링_book4_ 파일업로드

![8](https://github.com/dino-21/book_spring_step4_upload/assets/80396471/cba1c94a-7b8a-439a-9a3a-0cc8c75e4994)

![3](https://github.com/dino-21/book_spring_step4_upload/assets/80396471/ff4bca51-420c-4c25-844a-46965bb7061e)

![7](https://github.com/dino-21/book_spring_step4_upload/assets/80396471/001bc080-09a2-4a7f-8b97-cf97ab800c4b)


1.  commons-fileupload 라이브러리 추가
pom.xml  


2.  탐색기로 이미지 올라갈 폴더 만들기
C:\upload\tmp


3. sevlet-context.xml 파일 수정
<!-- 파일 업로드를 처리하기 위한 CommonsMultipartResolver 설정 -->
<beans:bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
	
    <!-- 기본 인코딩 설정 --> 
    <beans:property name="defaultEncoding" value="utf-8"></beans:property>
		
    <!-- 전체 업로드 크기 제한 (10MB) -->
    <!-- 1024 * 1024 * 10 bytes 10MB -->
    <beans:property name="maxUploadSize" value="104857560"></beans:property>

     등등
</beans:bean>


4. exUpload.jsp 파일만들기
<form action="/sample/exUploadPost" method="post" enctype="multipart/form-data">
      <input type="file" name="files" multiple>
      <input type="submit"> 
</form>


5. SampleUploadFile4.java 컨트롤 파일만들기
  @PostMapping("/exUploadPost")
  public void exUploadPost(ArrayList<MultipartFile> files) {} 파일 만들기

 @GetMapping("/exUpload")
 public String exUpload() {} 메서드 만들기


6.  실행 후 
http://localhost:8081/sample/exUpload 확인하기 
