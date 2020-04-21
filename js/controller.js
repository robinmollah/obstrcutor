const http = require('http');
const IP = "127.0.0.1";

const server = http.createServer((req, res) => {
	res.writeHead(200, { 'Content-Type': 'text/plain' });
	
	switch(req.url){
		case '/mouse':
			res.end("Mouse obstruction in progress");
			break;
		case '/keyboard':
			res.end("Keyboard obstruction in progress");
			break;
		case '/keyboard/off':
			res.end("Keyboard obstruction disabled");
			break;
		case '/mouse/off':
			res.end("Mouse obstruction disabled");
			break;
		default:
			res.end("Invalid request.");
	}
	
	res.end('okay');
});
server.on('connect', (req, socket, head) => {
	console.log(req, socket, head);
});
server.listen(1337, IP, () => {
	console.log("Server is listenting");
});

// TODO create a nodejs express server here

// TODO provide an UI with some buttons

//