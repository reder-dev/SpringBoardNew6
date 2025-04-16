<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

	<h1>/board/read.jsp</h1>
	
	<form role="form" action="" method="get">
		<input type="hidden" name="bno" value="${boardVO.bno }">
	
	</form>
	
	
	<div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">게시판 글쓰기</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <!-- action해당하는 속성정보가 없음
            	 => 자기 자신의 페이지 호출
            	 	(/board/regist 호출)
             -->
            
              <div class="box-body">
                <div class="form-group">
                  <label for="exampleInputEmail1">글 번호</label>
                  <input type="text" name="title" class="form-control" id="exampleInputEmail1" 
                  value="${boardVO.bno }" readonly>
                </div>
                
                <div class="box-body">
                <div class="form-group">
                  <label for="exampleInputEmail1">조회수</label>
                  <input type="text" name="writer" class="form-control" id="exampleInputEmail1" 
                  value="${boardVO.viewcnt }" readonly>
                </div>
              <div class="form-group">
                  <label>내용</label>
                  <textarea name="content" class="form-control" rows="3" 
                  placeholder="내용을 입력하시오" readonly></textarea>
                </div>
                
                
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" 
                class="btn btn-danger">수정하기</button>
                <button type="submit" 
                class="btn btn-warning">삭제하기</button>
                <button type="submit" 
                class="btn btn-primary">목록으로</button>
                
              </div>
            
          </div>
	
	<!-- <script src="./jQuery-2.1.4.min.js"></script> -->
	
	<script>
		// JSP(Java) -> HTML -> JavaScript -> Jquery
		//jQuery(js코드를 필요한것만 따로 모아놓음) 사용
		$(doument).read(function(){
		
			//alert("Hello!");
			$(".btn-primary").click(function(){
				
				//alert("버튼 클릭!");
				location.href="/board/listAll"
				
				
			});
			
			// 폼태그 정보가져오기
			var fr = $("form[role='form']");
			//concole.log(fr);
			
			// 수정하기 버튼 클릭시 
			$(".btn-danger").click(function(){
				alert("수정하기 버튼 클릭");
				// 글번호를 가지고 이동 (폼태그)
				// /board/modify, get방식 사용 페이지 이동
				fr.attr("action", "/board/modify");
				fr.submit();
				
				
			});
			
			$(".btn-danger").click(function(){
				alert("삭제하기 버튼 클릭");
				
				
			});
			
			
		});// ready
	
	
	</script>
	
	
	
	
<%@ include file="../include/footer.jsp" %>