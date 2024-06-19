/* 개인 API 인증키 */

const serviceKey = "개인 인증키를 작성하세요(문제 원인 X)";

const getAirPollution = (sidoName) => {

  const requestUrl = 'http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth';

  // 쿼리 스트링 생성 (URLSearchParams.toString())

  const searchParams = new URLSearchParams();

  searchParams.append('serviceKey', serviceKey);

  searchParams.append('returnType', 'JSON');
  searchParams.append('sidoName', sidoName);

  fetch(requestUrl + "?" + searchParams.toString())

  .then(resp => resp.json())

  .then(result => {

  console.log(result);

  })

  .catch(e => console.log(e));

}