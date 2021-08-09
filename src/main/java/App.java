import static spark.Spark.*;

public class App {

        public static void main(String[] args) {
            get("/hello",((request, response) ->
                    "<!DOCTYPE html>" +
                            "<html>" +
                            "<head>" +
                            "<title>Hello Friend!</title>" +
                    "<link rel='stylesheet' + href= 'https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
                    "</head>" +
                    "</body>" +
                       "<hi> Hello From Afar</hi>" +
                       "<p> Dear Friend,</p>" +
                       "<p> How are you? I hope you are having a nice weekend, I'm vacationing in the Iceland while learning programming! </p>" +
                       "<p> Friend, you would not believe how cold it is here. I should have gone to Hawaii instead.</p>" +
                       "<p> But i like programming a lot, so I've got that going for me.</p>" +
                       "<p> Looking forward to seeing you soon. I'll bring you back a souvenir.</p>" +
                       "<p> Cheers,</p>" +
                       "<p> Travel Enthusiast Kepha</p>" +
                            "</body>" +
                            "</html>"

            ) );
        }
}

