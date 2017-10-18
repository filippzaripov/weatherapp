function showWeather() {

    $('#weatherDiv').empty();

    var city = $("#City option:selected").text();
    var kazanWeather = "<p href=\"http://nochi.com/weather/kazan-4422\">\n" +
        "            <img src=\"https://w.bookcdn.com/weather/picture/26_4422_1_20_95a5a6_250_7f8c8d_ffffff_ffffff_1_2071c9_ffffff_0_6.png?scode=124&domid=589&anc_id=97874\" alt=\"booked.net\"/>\n" +
        "        </p>"
    var moscowWeather = "<p href=\"http://nochi.com/weather/moscow-18171\">\n" +
        "            <img src=\"https://w.bookcdn.com/weather/picture/26_18171_1_20_95a5a6_250_7f8c8d_ffffff_ffffff_1_2071c9_ffffff_0_6.png?scode=124&domid=589&anc_id=52393\"  alt=\"booked.net\"/>\n" +
        "        </p>"
    var SPBWeather = "<p href=\"http://nochi.com/weather/saint-petersburg-18398\">\n" +
        "            <img src=\"https://w.bookcdn.com/weather/picture/26_18398_1_20_95a5a6_250_7f8c8d_ffffff_ffffff_1_2071c9_ffffff_0_6.png?scode=124&domid=589&anc_id=52393\"  alt=\"booked.net\"/>\n" +
        "        </p>"


    switch (city){
        case 'Kazan': $('#weatherDiv').append(kazanWeather);
            break;
        case 'Moscow': $('#weatherDiv').append(moscowWeather);
            break;
        case 'Saint-Petersburg': $('#weatherDiv').append(SPBWeather);
            break;
        default: $('#weatherDiv').append("Please choose city");
            break;
    }

}