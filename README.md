# React & Spring boot 

1. Spring Boot + Security
2. CRA
3. React Router, Mobx, Babel, Webpack, React, EsLint, HRM?


# Spring Boot + Security

Pom.xml

```xml

```

Security-config.java

```java

```

# Create-React-App
CRA 패키지 

## CRA 설치
```
npm init react-app spring-react
```

## CRA 분석
package.json
```json
{
  "name": "spring-react",
  "version": "0.1.0",
  "private": true,
  "dependencies": {
    "@testing-library/jest-dom": "^4.2.4",
    "@testing-library/react": "^9.5.0",
    "@testing-library/user-event": "^7.2.1",
    "react": "^16.13.0",
    "react-dom": "^16.13.0",
    "react-scripts": "3.4.0"
  },
  "scripts": {
    "start": "react-scripts start",
    "build": "react-scripts build",
    "test": "react-scripts test",
    "eject": "react-scripts eject"
  },
  "eslintConfig": {
    "extends": "react-app"
  },
  "browserslist": {
    "production": [
      ">0.2%",
      "not dead",
      "not op_mini all"
    ],
    "development": [
      "last 1 chrome version",
      "last 1 firefox version",
      "last 1 safari version"
    ]
  }
}

```


## React Router 설치

```
npm install react-router-dom --save
```
## Sass 설치 (필요하면)

```
npm install node-sass --save
```

## ESLint/ Prettier
- ESLint : 문법 오류 체크
- Prettier : 포맷에 맞게 코드변경 (Eslint plugin 은 추가적인 Rule을 포함)
- eslint-plugin-prettier : Prettier에서 인식하는 코드상의 포맷 오류를 ESLint 오류로 출력해준다
- eslint-config-prettier : ESLint의 formatting관련 설정 중 Prettier와 충돌하는 부분을 비활성화 한다.
(Eslint에서도 formatting 처리함 충돌나는 부분 비활성화)

```
npm install --save-dev prettier eslint-plugin-prettier eslint-config-prettier 
npx install-peerdeps --dev eslint-config-airbnb
```

- CRA는 ESLint가 설치되어있음
- ESLint만 설치하면 CLI에서만 확인 가능 => ESLint Vscode확장팩설치
- VSCode 에서 포맷팅이 가능하도록 하거나 파일 저장 시에 포맷팅이 가능하도록 하기 위해서 확장 기능을 설치한다.
- settings.json에 다음과 같이 설정
```
"editor.formatOnSave": false, 
"[javascript]": {
    //default formatter
    "editor.defaultFormatter": "esbenp.prettier-vscode",
    "editor.formatOnSave": true
},
```

## Mobx 설치

```
npm i --save mobx --save mobx-react
```

### 데코레이터
customize-cra와 react-app-rewired는 eject 없이 CRA의 설정을 커스터마이징을 할 수 있도록 해주는 라이브러리 입니다. (eject보다 자유롭지는 않다)

만약 CRA(v1)을 쓰고 있다면 react-app-rewired 만 설치하면 됩니다.

저는 현재 최신 버전인 CRA v2 를 기준으로 하겠습니다.
```
npm install --save -d customize-cra
npm install --save -d react-app-rewired
```
두 가지를 설치하면 다음과 같이 package.json에 있는 scripts를 다음과 같이 수정합니다.

```
"scripts": {
	"start": "react-app-rewired start",
    "build": "react-app-rewired build",
    "test": "react-app-rewired test --env=jsdom",
    "eject": "react-scripts eject",
}
```


```
npm install --save-dev @babel/plugin-proposal-decorators
```

?
root에 jsconfig.json
```
{
    "compilerOptions": {
        "experimentalDecorators": true
    }
}
```