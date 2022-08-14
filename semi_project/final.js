'use strict';

// Make navbar transparent when it is on the top
const navbar = document.querySelector('#navbar');
const navbarHeight = navbar.getBoundingClientRect().height;

document.addEventListener('scroll', () => {
  //console.log(window.scrollY);
  //console.log(`navbarHeight: ${navbarHeight}`);
  if(window.scrollY > navbarHeight){
    navbar.classList.add('navbar--dark');
  }else{
    navbar.classList.remove('navbar--dark');
  }
});

// Handle scrolling when tapping on the navbar menu
/*
  네브바 메뉴가 클릭이 됐을 때 우리가 가야되는 섹션 아이들을 여기 로그에 한번 찍어 볼게요
  클릭이 되면 클릭한 이벤트가 들어오게 됩니다 그래서 이 이벤트를 이용해 볼건데요
  클릭이 되는 클릭이 되는 아이템의 이벤트에 타겟은 바로 우리가 클릭한 요소가 출력이
  될거예요 저장한 다음 눌러보면 클릭했을 때 타겟이 되는 아이가 이렇게 우리의 요소가 출력이 돼죠
  그래서 클릭하면 li가 나오고 navbar를 클릭하면 navbar메뉴 자체가 나와요 
  그래서 얘를 이용해서 여기  navbar 메뉴 아이템에 우리가 정의한 data를 정의할 수 있어요 
  그래서 data를 이용하면 되는데요 data다음에 우리가 원하는 data를 정의할 수 있어요 
  target이라던지 link같은 것을 이용해서 얘는 #home 이렇게 id를 포함해서 작성하면 어떤 걸
  클릭했을 때 쓸 수 있을 것 같거든요 
  다시 자바스크립트에서 target에 dataset이라는 것에 우리가 정의한 변수들이 다 할당이 
  되어지는데요 dataset 안에 우리가 data-link라고 했으니까 이 link를 찍어보면
  우리가 정의한 id가 나오는게 보이시죠
  그리고 navbar메뉴에는 우리가 이런 data를 넣지 않았으니까 undefined로 나오는게 있어요 

*/
const navbarMenu = document.querySelector('.navbar__menu');
navbarMenu.addEventListener('click', (event) => {
  //console.log(event.target);
  //console.log(event.target.dataset.link);// #home or #about를 찍어줌
  const target = event.target;
  const link = target.dataset.link;
  if(link == null){
    return;
  }
  navbarMenu.classList.remove('open');
  scrollIntoView(link);
});



// Navbar toggle button for small screen
const navbarToggleBtn = document.querySelector('.navbar__toggle-btn');
navbarToggleBtn.addEventListener('click', () => {
  navbarMenu.classList.toggle('open');
});

//  Handle click on "contact me" button on home
const homeContactBtn = document.querySelector('.home__contact');
  homeContactBtn.addEventListener('click', () => {
  scrollIntoView('#contact')
}); 

// Make home slowly fade to transparent as ther window scrolls down
/*
  한번에 급작스럽게 투명해지는 것이 아니라 스크롤링 되어져서 점점 멀어질 수록 
  더욱 더 투명하게 해야 되죠 그래서 어떻게 하면 될까요
  우선은 홈에 높이가 있고 스크롤링 하게되면 0부터 시작해서 얘네 만약 높이가 지금
  800이라고 하면 여기 800에 오겠죠 지금 홈 height도 800입니다
  총 높이는 800 그래서 스크롤링이 0에서 800의 중간 지점 400 으로 오면 0.5만큼
  투명하게 되고 800으로 오면 투명도가 0이 되고 시작할 때는 투명하면 안되니까
  1로 투명이 되겠죠
  저 여기서 힌트가 나오는데 홈 화면에 높이 800에 점점 내려가면 800에 400을 빼면
  400이죠 그럼 400은 800에 0.5배 입니다
  그래서 0.5배이고 800의 800을 빼면 0이죠 0%
  그리고 여기서는 스크롤이 0이니까 800에 0을 빼면 800 즉 1 100%이죠
  그래서 이런 수학 공식을 이용해서 opacity를 적용하면 될 거 같아요
*/
const home = document.querySelector('.home__container');
const homeHeight = home.getBoundingClientRect().height;
document.addEventListener('scroll', () => {
  //console.log(homeHeight);
  //console.log(1-window.scrollY / homeHeight);
  home.style.opacity = 1 - window.scrollY / homeHeight;
});

// Show "arrow up" button when scrolling down
const arrowUp = document.querySelector('.arrow-up');
document.addEventListener('scroll', () => {
// 홈에서 반정도 내려오면 이렇게 올라가는 아이콘이 생기도록 할거예요
// 윈도우에 scrollY가 우리가 가지고 있는  homeHeight의 절반 정도로 
// 이렇게 쭉 내려오면 우리가 스크롤업 버튼을 arrowUp = document.querySelector 를
// 이용해서  querySelector에서 클래스가 arrow-up. 그래서 얘네를 arrowUp에 있는
// 클래스를 추가해줄거예요  
  if(window.scrollY > homeHeight/2){
    arrowUp.classList.add('visible');
  }else{
    arrowUp.classList.remove('visible');/* 스크롤이 위에 있는 경우에는 보여지면 안되니까 */
  }
});

// Handle click on the "arrow up" button
arrowUp.addEventListener('click', () => {
  scrollIntoView('#home');
})

// Work categories안에 있는 버튼이 클릭되면 버튼 안에 들어 있는 필터값에 따라서
// 그 data-type에 해당하는 아이들만 보여 주도록 만든다
const workBtnContainer = document.querySelector('.work__categories');
const projectContainer = document.querySelector('.work__projects');
const projects = document.querySelectorAll('.project');
workBtnContainer.addEventListener('click', (e) => {
  const filter = e.target.dataset.filter || e.target.parentNode.dataset.filter;/* ||뒤에 조건은 버튼안에 숫자를 눌렀을 때 값을 받기 */
  //console.log(filter);
  if(filter == null) return;

  // 프로젝트 버튼을 클릭한 것을 active 해주기
  // Remove selection from the previous item and select the new one
  const active = document.querySelector('.category__btn.selected');
  active.classList.remove('selected');
  //프로젝트 버튼 안에 숫자는 span이라서 BUTTON 일때와  span일때를 분기해주어야 함
  const target = e.target.nodeName === 'BUTTON' ? e.target : e.target.parentNode;
  target.classList.add('selected');

  // 프로젝트가 필터링 될 때 애니메이션 효과를 줘보자
  projectContainer.classList.add('anim-out');

  // 일정 시간이 지난 다음에는 anim-out을 없애주어야 한다. 그래야 화면이 보이니까

  setTimeout(() => {/* 브라우저야 0.3초가 지난다음에 코드 블럭을 실행해줘 */
    projects.forEach((project) => {
      //console.log(project);
      //console.log(project.dataset.type);
      if(filter === '*' || filter === project.dataset.type){
  /*
    필터가 맞으면 invisible, 안보여주는 클래스를 빼고 만약 이런 필터에 해당이 안된다면
    project클래스에 안보여지도록 invisible이 안보여지는 거니까 이렇게 전부 다 이거나
    클릭한 필터와 데이터 타입이 매칭하면 보여줘야 되니까 안보여주는 클래스를 빼고, 
    만약에 타입이 필터랑 동일하지 않으면 안보여줘야 되니까 안보여줘야 되는 클래스를 등록해 준댜    
  */
        project.classList.remove('invisible');
      }else{
        project.classList.add('invisible');
      }
    });    
    projectContainer.classList.remove('anim-out');  
  }, 300);
  /* 아래 방식도 forEach와 동일한 처리 가능함 그러나 forEach를 선택하겠음
  console.log('---------------------------------------');
  for(let project of projects){
    console.log(project);
  }
  console.log('---------------------------------------');
  let project;
  for(let i=0; i<project.length;i++){
    project = project[i];
    console.log(project);
  }
  */
});

/*
  scrollIntoView는 엘리먼트 자체에 있는 함수야 인터페이스 인데 이거는 엘리먼트 얘가 있는
  parent컨테이너에 스크롤이 된데 그래서 이것만 불러도 되고 아니면 다른 옵션들을 이용해도 돼요
  여기에 보면 옵션 중에 behavior에서도 자동으로 되거나 스무스하게 되거나 이런 것들도 있데요
  그래서  scrollTo 우리가 가려고 하는 엘리먼트를 이용해서 여기서 우리가 쿼리는 바로 
  data link 에 있는 이 아이였죠? 그래서 얘를 엘리먼트를 받아서 scrollTo에 scrollIntoView()
  일단 옵션없이 얘만 불러 볼게요. 잘 됩니다 
*/
function scrollIntoView(selector){
  const scrollTo = document.querySelector(selector);
  scrollTo.scrollIntoView({ behavior: 'smooth' });
}