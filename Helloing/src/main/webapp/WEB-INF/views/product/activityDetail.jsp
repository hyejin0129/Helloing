<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Helloing</title>
<link href="resources/css/product/activityDetail.css" rel="stylesheet" type="text/css">
</head>
<body>

	<jsp:include page="../common/menubar_user.jsp"/>
	
	<div style="height: 70px;"></div>
	
	<div class="inner">
		<div class="middle-content">
			<div class="main">

				<div class="top-info">
					<sapn class="acticityName">[QR바로입장] 롯데월드 어드벤처 종합이용권</sapn>
				</div>
				<div>
					<p>⭐⭐⭐⭐⭐ 4.0 (173) ∨</p> <!-- 클릭 시 후기 div로 이동 -->
				</div>
				<hr>
				<div>
					<p>📆 유효기간 (2023.01.01 ~ 2023.03.25) 내 사용</p>
				</div>
				<hr>

				<div class="images"> <!-- 이미지 클릭 시 모달창?으로 이미지 크게 띄우기 -->
					<img src="/helloing/resources/img/logo_outline.png" width="780" height="500">
					<div class="sub-images">
						<img src="/helloing/resources/img/logo_outline.png" width="250" height="160">
						<img src="/helloing/resources/img/logo_outline.png" width="250" height="160">
						<img src="/helloing/resources/img/logo_outline.png" width="250" height="160">
					</div>
				</div>

				<div>
					<div class="ticketlist"><!-- 티켓 박스 div 포문 돌리기~ -->
						<div class="ticketbox">
							<div class="ticket-info">
								<p><span class="ticketName">종일 종합이용권 1인</span><br>
									* 주중/주말 공통<br>
									* 롯데월드파크 + 민속박물관 모두 이용가능</p>
							</div>
							<div class="ticket-price">
								<span>38,600원</span>
							</div>
							<div class="ticket-count">
								<button>-</button>
								<span class="count">0</span>
								<button>+</button>
							</div>
						</div>
						<div class="ticketbox">
							<div class="ticket-info">
								<p><span class="ticketName">종일 종합이용권 1인</span><br>
									* 주중/주말 공통<br>
									* 롯데월드파크 + 민속박물관 모두 이용가능</p>
							</div>
							<div class="ticket-price">
								<span>38,600원</span>
							</div>
							<div class="ticket-count">
								<button>-</button>
								<span class="count">0</span>
								<button>+</button>
							</div>
						</div>
						<div class="ticketbox">
							<div class="ticket-info">
								<p><span class="ticketName">종일 종합이용권 1인</span><br>
									* 주중/주말 공통<br>
									* 롯데월드파크 + 민속박물관 모두 이용가능</p>
							</div>
							<div class="ticket-price">
								<span>38,600원</span>
							</div>
							<div class="ticket-count">
								<button>-</button>
								<span class="count">0</span>
								<button>+</button>
							</div>
						</div>
						
						<div class="order-info"> <!-- 자바스크립트로 쿠폰 수량을 늘렸을때만 아래 코드 나오기 -->
							<span>종일 종합이용권 1인</span>
							<span>1 X 22,500원 <span class="text-bold">22,500원</span></span>
						</div>
						<hr>
						<div class="all-price"><p>총 티켓 금액<span class="point">22,500원</span></p></div>
					</div>
					<div id="btn-pay"><a href="reserve.activity">결제하기</a></div>
				</div>

				<hr>

				<div class="explanation">
					<div class="title"><span>소개</span></div>
					<div><p>무엇을 위하여 광야에서 방황하였으며 공자는 무엇을 위하여 천하를 철환하였는가? 밥을 위하여서 옷을 위하여서 미인을 구하기 위하여서 그리하였는가? 아니다 그들은 커다란 이상 곧 만천하의 대중을 품에 안고 그들에게 밝은 길을 찾아 주며 그들을</p></div>
				</div>
				<hr>

				<div class="explanation">
					<div class="title"><span>이용안내</span></div>
					<div><p>무엇을 위하여 광야에서 방황하였으며 공자는 무엇을 위하여 천하를 철환하였는가? 밥을 위하여서 옷을 위하여서 미인을 구하기 위하여서 그리하였는가? 아니다 그들은 커다란 이상 곧 만천하의 대중을 품에 안고 그들에게 밝은 길을 찾아 주며 그들을</p></div>
				</div>
				<hr>

				<div>
					<h3 class="reviewtitle">후기 173</h3>
					<div class="reviewstar">
						<div>
							<p><span>4.3</span><br>
							⭐⭐⭐⭐⭐</p>
						</div>
						<div class="starlist">
							<table>
								<tr>
									<td align="right">⭐⭐⭐⭐⭐ </td>
									<td width="200"><progress value="130" max="1000"></progress></td>
									<td>106명</td>
								</tr>
								<tr>
									<td align="right">⭐⭐⭐⭐ </td>
									<td><progress value="130" max="1000"></progress></td>
									<td>106명</td>
								</tr>
								<tr>
									<td align="right">⭐⭐⭐ </td>
									<td><progress value="130" max="1000"></progress></td>
									<td>106명</td>
								</tr>
								<tr>
									<td align="right">⭐⭐ </td>
									<td><progress value="130" max="1000"></progress></td>
									<td>106명</td>
								</tr>
								<tr>
									<td align="right">⭐ </td>
									<td><progress value="130" max="1000"></progress></td>
									<td>106명</td>
								</tr>
							</table>
						</div>
					</div>

					<div class="radio-sort">
						<input type="radio" name="radio-sort" id="recomm"><label for="recomm">추천순</label>
						<input type="radio" name="radio-sort" id="manyreview"><label for="manyreview">많은 후기순</label>
						<input type="radio" name="radio-sort" id="highstar"><label for="highstar">높은 평점순</label>
						<input type="radio" name="radio-sort" id="lowprice"><label for="lowprice">낮은 가격순</label>
						<input type="radio" name="radio-sort" id="highprice"><label for="highprice">높은 가격순</label>
					</div>
					
					<div><!-- 리뷰 포문 돌리기 -->
						<div class="reviewbox">
							<p>⭐⭐⭐⭐⭐ 김*미<br>
								2022.08.08 | 디럭스 패밀리트윈</p>
							<p class="review-content">너무너무 깨끗하고<br>
								가성비 최고!<br>
								이런 곳이 진작 있는 줄 알았다면...</p>
						</div>
						<hr>
						<div class="reviewbox">
							<p>⭐⭐⭐⭐⭐ 김*미<br>
								2022.08.08 | 디럭스 패밀리트윈</p>
							<p class="review-content">너무너무 깨끗하고<br>
								가성비 최고!<br>
								이런 곳이 진작 있는 줄 알았다면...</p>
						</div>
						<hr>
						<div class="reviewbox">
							<p>⭐⭐⭐⭐⭐ 김*미<br>
								2022.08.08 | 디럭스 패밀리트윈</p>
							<p class="review-content">너무너무 깨끗하고<br>
								가성비 최고!<br>
								이런 곳이 진작 있는 줄 알았다면...</p>
						</div>
						<hr>
						<div class="reviewbox">
							<p>⭐⭐⭐⭐⭐ 김*미<br>
								2022.08.08 | 디럭스 패밀리트윈</p>
							<p class="review-content">너무너무 깨끗하고<br>
								가성비 최고!<br>
								이런 곳이 진작 있는 줄 알았다면...</p>
						</div>
						<hr>
						<div class="reviewbox">
							<p>⭐⭐⭐⭐⭐ 김*미<br>
								2022.08.08 | 디럭스 패밀리트윈</p>
							<p class="review-content">너무너무 깨끗하고<br>
								가성비 최고!<br>
								이런 곳이 진작 있는 줄 알았다면...</p>
						</div>
						<hr>
					</div>

					<div class="page-bar"><!-- 페이징바 리뷰는 5개씩 보여줄거다 -->
						<ul>
		                    <li><a href="">&lt;</a></li>
							<li><a href="">1</a></li>
							<li><a href="">2</a></li>
							<li><a href="">3</a></li>
							<li><a href="">4</a></li>
							<li><a href="">5</a></li>
		                    <li><a href="">&gt;</a></li>
                		</ul>
					</div>

				</div>

			</div>

			<div class="side-bar">
				<div class="accommselectbox">
					<p><span>65,000원부터 ~</span></p>
					<button>티켓 선택하기</button> <!-- 버튼 누르면 객실 선택하는 div로 이동 -->
					<div><button id="btn-wish">♥️ 위시리스트에 담기</button></div>
				</div>
			</div>
		</div>
	</div>

	<div style="height: 300px;"></div>
	
</body>
</html>