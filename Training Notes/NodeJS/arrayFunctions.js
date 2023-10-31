country=["India","USA","UK","Canada","Japan"];
capitals=["New Delhi","New York","Ottawa","Canberra","Tokyo"]
function getCapitals(Country){
 for(i in country){
    if(country[i]==Country)
    return capitals[i];
 }
return "Country does not ecxist";
}
module.exports.getCapCity=getCapitals;