<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
	<link rel="icon" href="/favicon.ico">
	<meta charset="UTF-8">
	<meta name="format-detection" content="telephone=no">
	<title>패스트도서관 - 패스트 도서관에 오신 것을 환영합니다</title>
	<meta name="title" content="패스트도서관 - 패스트 도서관에 오신 것을  환영합니다">
	<meta name="description" content="프론트엔드 개발자 대영의 작업물입니다. 또한 이 웹사이트는 jsp로 구현되어있습니다. 디자인 저작권은 제작자 영에게 있습니다.">
	<meta name="keywords" content="javascript, ES6, React, Vue, Nextjs, typescript, 포트폴리오">
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="robots" content="INDEX,FOLLOW">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=0.25, maximum-scale=4">
	<meta name="theme-color" content="pink">
	<meta property="og:type" content="website">
	<meta property="og:title" content="패스트도서관 - 패스트 도서관에 오신 것을  환영합니다">
	<meta property="og:description" content="프론트엔드 개발자 대영의 작업물입니다. 또한 이 웹사이트는 jsp로 구현되어있습니다. 디자인 저작권은 제작자 영에게 있습니다.">
	<meta property="og:image" content="https://www.gloomy-store.com/images/logo20_1.png">
	<meta property="og:url" content="https://www.gloomy-store.com">
	<link rel="apple-touch-icon" href="/logo192.png">
	<meta name="next-head-count" content="19">
	<link rel="stylesheet" href="/css/reset.css">
	<link rel="stylesheet" href="/css/globals.css">
	<script defer src="/libs/script.js"></script>
	<script src="/libs/jquery-3.7.0.min.js"></script>
</head>

<body>
	<!-- nav placeholder -->
	<div class="nav-placeholder"></div>
	<script>
		$('.nav-placeholder').load('/include/nav.html');
	</script>
	<!-- //nav placeholder -->
	<div class="wrap">
		<header class="img-box header mb-100">
			<div class="img-box--words">
				<h1 class="">도서 고객 및 대여관리 프로그램</h1>
				<p class="">ver 1.0</p>
			</div>
		</header>
		<section class="section fadeInUp">
			<h2 class="title-02" id="skill">고객정보수정</h2>
<!--			<h3 class="title-03">프로그램 작성순서</h3>-->
			<form action="/editComplete" class="mt-50" id="form" method="POST">
			    <div class="ly-flex">
			        <h6 class="mr-20 wp-150 bold">고객번호</h6>
			        <input type="text" name="cust_no" id="cust_no" readonly value="${user.cust_no}">
			    </div>
			    <div class="ly-flex mt-15">
			        <h6 class="mr-20 wp-150 bold">고객이름</h6>
			        <input type="text" name="cust_name" id="cust_name" value="${user.cust_name}">
			    </div>
			    <div class="ly-flex mt-15">
			        <h6 class="mr-20 wp-150 bold">전화번호</h6>
			        <input type="text" name="phone" id="phone" value="${user.phone}">
			    </div>
			    <div class="ly-flex mt-15">
			        <h6 class="mr-20 wp-150 bold">이메일</h6>
			        <input type="text" name="cust_email" id="cust_email" value="${user.cust_email}">
			    </div>
			    <div class="ly-flex mt-15">
			        <h6 class="mr-20 wp-150 bold">고객등급(P,G,S)</h6>
			        <input type="text" name="grade" id="grade" value="${user.grade}">
			    </div>
			    <div class="ly-flex-center mt-45 t-center">
			        <button type="button" onclick="onSubmit()">수정</button>
			        <button type="button" class="ml-20" onclick="goEdit()">조회</button>
			    </div>
			    <input type="hidden" name="join_date" id="join_date" value="${user.join_date}">
			</form>

		</section>

	</div>
	<!-- footer placeholder -->
	<div class="footer-placeholder"></div>
	<script>
		$('.footer-placeholder').load('/include/footer.html');
	</script>
	<!-- //footer placeholder -->
	
	<script>
		function onSubmit() {
			const grades = ['P','S','G']
			const cust_no = document.querySelector('#cust_no')
			const cust_name = document.querySelector('#cust_name')
			const phone = document.querySelector('#phone')
			const cust_email = document.querySelector('#cust_email')
			const grade = document.querySelector('#grade')
			const form =  document.querySelector('#form')
			if(!cust_no.value) return alert('뭔가 에러가 났습니다. 다시 접속해주세요')
			else if(!cust_name.value) {
				cust_name.focus();
				return alert('고객이름이 입력되지 않았습니다.');
			}
			else if(!phone.value) {
				phone.focus();
				return alert('폰번호가 입력되지 않았습니다.');
			}
			else if(!cust_email.value) {
				cust_email.focus();
				return alert('이메일이 입력되지 않았습니다.');
				// 한정된 시간 안에 정규식으로 이메일 검증하는 것 넣기에는 너무 빡셉니다...
			}
			else if(!grade.value || grades.indexOf(grade.value) === -1) {
				grade.focus();
				return alert('고객등급이 입력되지 않았습니다. P, G, S중 하나로 입력하세요');
			}
			form.submit();
		}
		function goEdit() {
			window.location.href = '/edit';
		}
	</script>
</body></html>
