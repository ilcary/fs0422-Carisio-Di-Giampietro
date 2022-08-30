var Color;
(function (Color) {
    Color["Red"] = "#970000";
    Color["Grey"] = "#ccc";
    Color["Black"] = "#000";
})(Color || (Color = {}));
console.log(Color.Red);
var Months;
(function (Months) {
    Months[Months["Gennaio"] = 2] = "Gennaio";
    Months[Months["Febbraio"] = 3] = "Febbraio";
    Months[Months["Marzo"] = 4] = "Marzo";
})(Months || (Months = {}));
console.log(Months.Gennaio);
console.log(Months.Febbraio);
