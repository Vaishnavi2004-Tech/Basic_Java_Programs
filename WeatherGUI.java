import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.io.*;

public class WeatherGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Weather App");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter City:");

        JTextField cityField = new JTextField(15);

        JButton button = new JButton("Get Weather");

        JTextArea output = new JTextArea(8,25);
        output.setEditable(false);

        frame.add(label);
        frame.add(cityField);
        frame.add(button);
        frame.add(output);

        button.addActionListener(e -> {

            String city = cityField.getText();

            String apiKey = "aceaf285fe7b2f09353245b32ccf336c";

            try {

                String url =
                "https://api.openweathermap.org/data/2.5/weather?q="
                + city
                + "&appid="
                + apiKey
                + "&units=metric";

                URL apiUrl = new URL(url);

                BufferedReader br =
                new BufferedReader(
                new InputStreamReader(apiUrl.openStream()));

                String data = "";
                String line;

                while((line = br.readLine()) != null){
                    data += line;
                }

                String weather =
                data.split("\"main\":\"")[1].split("\"")[0];

                String temp =
                data.split("\"temp\":")[1].split(",")[0];

                String humidity =
                data.split("\"humidity\":")[1].split("}")[0];

                output.setText(
                "Weather: " + weather +
                "\nTemperature: " + temp + " °C" +
                "\nHumidity: " + humidity + "%"
                );

            } catch(Exception ex) {

                output.setText(
                "Error!\nCheck API Key / Internet / City Name");
            }
        });

        frame.setVisible(true);
    }
}