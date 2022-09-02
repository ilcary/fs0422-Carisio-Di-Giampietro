"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var User = /** @class */ (function () {
    function User(__carica) {
        this.carica = __carica; /* credito */
        this.numeroChiamate = 0; /* chiamate effettuate */
        this.costoPerMinuto = 0.20; /* tariffa */
    }
    User.prototype.ricarica = function (unaRicarica) {
        this.carica += unaRicarica;
    };
    User.prototype.chiamata = function (minutiDurata) {
        var credito = (this.carica - (minutiDurata * this.costoPerMinuto)).toFixed(2);
        this.carica = +credito; // to convert the string fixed we can use the parseInt or parseFloat functions, or simply use the unary + operator
        this.numeroChiamate++;
    };
    User.prototype.numero404 = function () {
        return this.carica;
    };
    User.prototype.getNumeroChiamate = function () {
        return this.numeroChiamate;
    };
    User.prototype.azzeraChiamate = function () {
        this.numeroChiamate = 0;
    };
    return User;
}());
var Carisio = new User(0);
var Chiamata = /** @class */ (function () {
    function Chiamata(__durata, __tariffa) {
        this.durata = __durata;
        this.tariffa = __tariffa;
        this.calcolacosto();
    }
    Chiamata.prototype.calcolacosto = function () {
        this.costo = (this.durata * this.tariffa);
    };
    return Chiamata;
}());
new /** @class */ (function (_super) {
    __extends(telefono, _super);
    function telefono() {
        var _this = _super.call(this, 10) || this;
        _this.callicon = document.querySelector('#call');
        _this.vodafone = document.querySelector('#vodafone');
        _this.phone = document.querySelector('#iphonecover');
        _this.icone = document.querySelectorAll('.icon');
        _this.vodafoneMode = document.querySelectorAll('.vodafoneMode');
        _this.callapp = document.querySelectorAll('.callapp');
        _this.home = document.querySelector('#home');
        _this.chiama = document.querySelector('#chiama');
        _this.ricaricaV = document.querySelector('#ricarica');
        _this.creditoV = document.querySelector('#credito');
        _this.registroChiamatebtnV = document.querySelector('#registroChiamatebtn');
        _this.inputNumero = document.querySelector('#displayCall');
        _this.registroChiamate = [];
        _this.iconCellEvent();
        _this.iconVodafoneEvent();
        _this.homeEvent();
        _this.chiamaEvent();
        _this.ricaricaEvent();
        _this.registroEvent();
        return _this;
    }
    telefono.prototype.getRandomInt = function () {
        return Math.floor(Math.random() * 20);
    };
    telefono.prototype.iconCellEvent = function () {
        var _this = this;
        var _a;
        (_a = this.callicon) === null || _a === void 0 ? void 0 : _a.addEventListener('click', function () {
            _this.phone.style.backgroundImage = "url('./images/iphone-keypad.png')";
            _this.icone.forEach(function (i) { return i.classList.add('d-none'); });
            _this.callapp.forEach(function (i) { return i.classList.remove('d-none'); });
        });
    };
    telefono.prototype.iconVodafoneEvent = function () {
        var _this = this;
        var _a;
        (_a = this.vodafone) === null || _a === void 0 ? void 0 : _a.addEventListener('click', function () {
            var _a, _b, _c;
            var creditoDisplay = (_a = _this.creditoV) === null || _a === void 0 ? void 0 : _a.textContent;
            creditoDisplay = _this.carica.toString();
            console.log(creditoDisplay);
            console.log(_this.creditoV);
            _this.phone.style.backgroundImage = "url('./images/iphone-vodafone.png')";
            _this.icone.forEach(function (i) { return i.classList.add('d-none'); });
            _this.vodafoneMode.forEach(function (i) { return i.classList.remove('d-none'); });
            (_b = _this.home) === null || _b === void 0 ? void 0 : _b.classList.remove('d-none');
            (_c = _this.home) === null || _c === void 0 ? void 0 : _c.classList.add('appvodafone');
        });
    };
    telefono.prototype.homeEvent = function () {
        var _this = this;
        var _a;
        (_a = this.home) === null || _a === void 0 ? void 0 : _a.addEventListener('drag', function () {
            var _a;
            _this.phone.style.backgroundImage = "url('./images/iphone-home-screen.png')";
            _this.icone.forEach(function (i) { return i.classList.remove('d-none'); });
            _this.callapp.forEach(function (i) { return i.classList.add('d-none'); });
            _this.vodafoneMode.forEach(function (i) { return i.classList.add('d-none'); });
            (_a = _this.home) === null || _a === void 0 ? void 0 : _a.classList.remove('appvodafone');
        });
    };
    telefono.prototype.chiamaEvent = function () {
        var _this = this;
        var _a;
        (_a = this.chiama) === null || _a === void 0 ? void 0 : _a.addEventListener('click', function () {
            var _a;
            var numeroTel = (_a = _this.inputNumero) === null || _a === void 0 ? void 0 : _a.value;
            console.log(numeroTel);
            if (numeroTel == '404') {
                alert("IL TUO CREDITO E' ".concat(_this.numero404()));
            }
            else {
                var durata = _this.getRandomInt();
                _this.chiamata(durata);
                _this.registroChiamate.push(new Chiamata(durata, _this.costoPerMinuto));
                console.log(_this.registroChiamate);
            }
        });
    };
    telefono.prototype.ricaricaEvent = function () {
        var _this = this;
        var _a;
        (_a = this.ricaricaV) === null || _a === void 0 ? void 0 : _a.addEventListener('click', function () {
            var _a;
            var inputRicarica = document.createElement('input');
            inputRicarica.classList.add('icarica');
            inputRicarica.placeholder = "Importo €";
            (_a = _this.phone) === null || _a === void 0 ? void 0 : _a.append(inputRicarica);
            inputRicarica.addEventListener("keyup", function (e) {
                if (e.key === "Enter") {
                    _this.ricarica(+inputRicarica.value);
                    console.log(inputRicarica.value);
                    inputRicarica.remove();
                }
            });
        });
    };
    telefono.prototype.registroEvent = function () {
        var _a;
        (_a = this.registroChiamatebtnV) === null || _a === void 0 ? void 0 : _a.addEventListener("click", function () {
            window.location.replace("./registrochiamate.html");
        });
    };
    return telefono;
}(User));
//# sourceMappingURL=app.js.map