var Color;
(function (Color) {
    Color["Red"] = "#970000";
    Color["Grey"] = "#ccc";
    Color["Black"] = "#000";
})(Color || (Color = {}));
console.log(Color.Red);
var Months;
(function (Months) {
    Months[Months["Gennaio"] = 0] = "Gennaio";
    Months[Months["Febbraio"] = 1] = "Febbraio";
    Months[Months["Marzo"] = 2] = "Marzo";
})(Months || (Months = {}));
console.log(Months.Gennaio);
console.log(Months.Febbraio);
