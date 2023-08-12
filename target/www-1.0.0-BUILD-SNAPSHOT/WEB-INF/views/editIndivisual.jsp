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
			<form action="" class="mt-50">
				<div class="ly-flex">
					<h6 class="mr-20 wp-150 bold">고객번호</h6>
					<input type="text" name="cust_no" readonly value="${idx}">
				</div>
				<div class="ly-flex mt-15">
					<h6 class="mr-20 wp-150 bold">고객이름</h6>
					<input type="text" name="cust_name" value="박매일">
				</div>
				<div class="ly-flex mt-15">
					<h6 class="mr-20 wp-150 bold">전화번호</h6>
					<input type="text" name="phone" value="010-1111-1111">
				</div>
				<div class="ly-flex mt-15">
					<h6 class="mr-20 wp-150 bold">이메일</h6>
					<input type="text" name="cust_email" value="bit01@naver.com">
				</div>
				<div class="ly-flex mt-15">
					<h6 class="mr-20 wp-150 bold">고객등급(P,G,S)</h6>
					<input type="text" name="grade" value="P">
				</div>
				<div class="ly-flex-center mt-45 t-center">
					<button type="button" onclick="completeEdit()">수정</button>
					<button type="button" class="ml-20" onclick="goEdit()">조회</button>
				</div>
			</form>
		</section>

	</div>
	<!-- footer placeholder -->
	<div class="footer-placeholder"></div>
	<script>
		$('.footer-placeholder').load('/include/footer.html');
	</script>
	<!-- //footer placeholder -->
	

</body></html>
