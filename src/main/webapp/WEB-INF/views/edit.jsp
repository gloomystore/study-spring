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
	<link rel="stylesheet" href="http://spring.gloomy-store.com/resources/css/reset.css">
	<link rel="stylesheet" href="http://spring.gloomy-store.com/resources/css/globals.css">
	<script defer src="http://spring.gloomy-store.com/resources/libs/script.js"></script>
	<script src="http://spring.gloomy-store.com/resources/libs/jquery-3.7.0.min.js"></script>
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
				<h2 class="title-02" id="skill">고객목록조회/수정</h2>
				
				<div class="table mt-50">
					<table summary="summary">
					<caption></caption>
					<colgroup>
						<col style="width: 16.6666%;">
						<col style="width: 16.6666%;">
						<col style="width: 16.6666%;">
						<col style="width: 16.6666%;">
						<col style="width: 16.6666%;">
						<col style="width: *">
					</colgroup>
                    <thead>
                        <tr>
                            <th scope="col">고객번호</th>
                            <th scope="col">고객 이름</th>
                            <th scope="col">전화번호</th>
                            <th scope="col">가입일자</th>
                            <th scope="col">이메일</th>
                            <th scope="col">고객등급</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="user" items="${userList}"> <!-- Loop through the user list -->
                            <tr>
                                <td>
                                    <p class="td-desc">
                                        <a href="/edit/${user.cust_no}">${user.cust_no}</a>
                                    </p>
                                </td>
                                <td>
                                    <p class="td-desc">${user.cust_name}</p>
                                </td>
                                <td>
                                    <p class="td-desc">${user.phone}</p>
                                </td>
                                <td>
                                    <p class="td-desc">${user.join_date}</p>
                                </td>
                                <td>
                                    <p class="td-desc">${user.cust_email}</p>
                                </td>
                                <td>
                                    <p class="td-desc">${user.grade}</p>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </section>
    </div>
    <!-- footer placeholder -->
    <div class="footer-placeholder"></div>
    <script>
        $('.footer-placeholder').load('/include/footer.html');
    </script>
    <!-- //footer placeholder -->
</body>

</html>`