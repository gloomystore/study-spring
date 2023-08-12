const divElement = document.querySelector('.fadeInUp');
const windowHeight = window.innerHeight;

function handleScroll() {
	const divTop = divElement.getBoundingClientRect().top;

	if (divTop < windowHeight && divTop > -divElement.clientHeight) {
		divElement.classList.add('active');
	} else {
		divElement.classList.remove('active');
	}
}

window.addEventListener('scroll', handleScroll);
window.addEventListener('load', handleScroll);


function toggleNav() {
	const nav = document.querySelector('.nav-hamburger');
	const navMenu = document.querySelector('.nav-menu');
	if(nav.classList.contains('active')) {
		nav.classList.remove('active')
		navMenu.classList.remove('active')
	}
	else {
		nav.classList.add('active')
		navMenu.classList.add('active')
	}
}
