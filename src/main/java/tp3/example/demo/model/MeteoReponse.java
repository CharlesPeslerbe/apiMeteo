package tp3.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MeteoReponse {

    public static class Prevision {
        private List<Weather> forecast;

        @JsonProperty("forecast")
        public List<Weather> getForecast() {
            return forecast;
        }
    }

    public static class Weather {
        @JsonProperty("datetime")
        private String datetime;

        @JsonProperty("tmin")
        private int tmin;

        @JsonProperty("tmax")
        private int tmax;

        @JsonProperty("weather")
        private int weather;

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public int getTmin() {
            return tmin;
        }

        public void setTmin(int tmin) {
            this.tmin = tmin;
        }

        public int getTmax() {
            return tmax;
        }

        public void setTmax(int tmax) {
            this.tmax = tmax;
        }

        public int getWeather() {
            return weather;
        }

        public void setWeather(int weather) {
            this.weather = weather;
        }

        public String getWeatherText(int weather) {
            switch (weather) {
                case 0:
                    return "Soleil";
                case 1:
                    return "Peu nuageux";
                case 2:
                    return "Ciel voilé";
                case 3:
                    return "Nuageux";
                case 4:
                    return "Très nuageux";
                case 5:
                    return "Couvert";
                case 6:
                    return "Brouillard";
                case 7:
                    return "Brouillard givrant";
                case 10:
                    return "Pluie faible";
                case 11:
                    return "Pluie modérée";
                case 12:
                    return "Pluie forte";
                case 13:
                    return "Pluie faible verglaçante";
                case 14:
                    return "Pluie modérée verglaçante";
                case 15:
                    return "Pluie forte verglaçante";
                case 16:
                    return "Bruine";
                case 20:
                    return "Neige faible";
                case 21:
                    return "Neige modérée";
                case 22:
                    return "Neige forte";
                case 30:
                    return "Pluie et neige mêlées faibles";
                case 31:
                    return "Pluie et neige mêlées modérées";
                case 32:
                    return "Pluie et neige mêlées fortes";
                case 40:
                    return "Averses de pluie locales et faibles";
                case 41:
                    return "Averses de pluie locales";
                case 42:
                    return "Averses locales et fortes";
                case 43:
                    return "Averses de pluie faibles";
                case 44:
                    return "Averses de pluie";
                case 45:
                    return "Averses de pluie fortes";
                case 46:
                    return "Averses de pluie faibles et fréquentes";
                case 47:
                    return "Averses de pluie fréquentes";
                case 48:
                    return "Averses de pluie fortes et fréquentes";
                case 60:
                    return "Averses de neige localisées et faibles";
                case 61:
                    return "Averses de neige localisées";
                case 62:
                    return "Averses de neige localisées et fortes";
                case 63:
                    return "Averses de neige faibles";
                case 64:
                    return "Averses de neige";
                case 65:
                    return "Averses de neige fortes";
                case 66:
                    return "Averses de neige faibles et fréquentes";
                case 67:
                    return "Averses de neige fréquentes";
                case 68:
                    return "Averses de neige fortes et fréquentes";
                case 70:
                    return "Averses de pluie et neige mêlées localisées et faibles";
                case 71:
                    return "Averses de pluie et neige mêlées localisées";
                case 72:
                    return "Averses de pluie et neige mêlées localisées et fortes";
                case 73:
                    return "Averses de pluie et neige mêlées faibles";
                case 74:
                    return "Averses de pluie et neige mêlées";
                case 75:
                    return "Averses de pluie et neige mêlées fortes";
                case 76:
                    return "Averses de pluie et neige mêlées faibles et nombreuses";
                case 77:
                    return "Averses de pluie et neige mêlées fréquentes";
                case 78:
                    return "Averses de pluie et neige mêlées fortes et fréquentes";
                case 100:
                    return "Orages faibles et locaux";
                case 101:
                    return "Orages locaux";
                case 102:
                    return "Orages fort et locaux";
                case 103:
                    return "Orages faibles";
                case 104:
                    return "Orages";
                case 105:
                    return "Orages forts";
                case 106:
                    return "Orages faibles et fréquents";
                case 107:
                    return "Orages fréquents";
                case 108:
                    return "Orages forts et fréquents";
                case 120:
                    return "Orages faibles et locaux de neige ou grésil";
                case 121:
                    return "Orages locaux de neige ou grésil";
                case 122:
                    return "Orages locaux de neige ou grésil";
                case 123:
                    return "Orages faibles de neige ou grésil";
                case 124:
                    return "Orages de neige ou grésil";
                case 125:
                    return "Orages de neige ou grésil";
                case 126:
                    return "Orages faibles et fréquents de neige ou grésil";
                case 127:
                    return "Orages fréquents de neige ou grésil";
                case 128:
                    return "Orages fréquents de neige ou grésil";
                case 130:
                    return "Orages faibles et locaux de pluie et neige mêlées ou grésil";
                case 131:
                    return "Orages locaux de pluie et neige mêlées ou grésil";
                case 132:
                    return "Orages fort et locaux de pluie et neige mêlées ou grésil";
                case 133:
                    return "Orages faibles de pluie et neige mêlées ou grésil";
                case 134:
                    return "Orages de pluie et neige mêlées ou grésil";
                case 135:
                    return "Orages forts de pluie et neige mêlées ou grésil";
                case 136:
                    return "Orages faibles et fréquents de pluie et neige mêlées ou grésil";
                case 137:
                    return "Orages fréquents de pluie et neige mêlées ou grésil";
                case 138:
                    return "Orages forts et fréquents de pluie et neige mêlées ou grésil";
                case 140:
                    return "Pluies orageuses";
                case 141:
                    return "Pluie et neige mêlées à caractère orageux";
                case 142:
                    return "Neige à caractère orageux";
                case 210:
                    return "Pluie faible intermittente";
                case 211:
                    return "Pluie modérée intermittente";
                case 212:
                    return "Pluie forte intermittente";
                case 220:
                    return "Neige faible intermittente";
                case 221:
                    return "Neige modérée intermittente";
                case 222:
                    return "Neige forte intermittente";
                case 230:
                    return "Pluie et neige mêlées";
                case 231:
                    return "Pluie et neige mêlées";
                case 232:
                    return "Pluie et neige mêlées";
                case 235:
                    return "Averses de grêle";
                default:
                    return "Inconnu";
            }
        }
    }


}
