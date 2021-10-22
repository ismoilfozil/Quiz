package uz.gita.quiz;

import java.util.ArrayList;

public class TestRepository implements TestContract.Model {
    ArrayList<Question> questions;

    public TestRepository() {
        questions = new ArrayList<>();
        questions.add(new Question("1.What's a polygon with four unequal sides called?", "Binary", "Hologram", "Quadrilateral", "Pythagoras", "Quadrilateral"));
        questions.add(new Question("2.What number does \"Giga\" stand for?", "One Billion", "One Million", "One Thousand", "One Hundred", "One Billion"));
        questions.add(new Question("3.What digit did Arab mathematician al-Khwarizmi give to the West around 800 B/B.?", "Teen", "Zero", "One", "Two", "Zero"));
        questions.add(new Question("4.What word describes a number system with a base of two?", "Decimal", "Binary", "Octal", "Hexadecimal", "Binary"));
        questions.add(new Question("5.How many equal sides does an icosahedron have?", "Eight", "Ten", "Twelve", "Twenty", "Twenty"));
        questions.add(new Question("6.How many sides does have a Nonagon", "six", "seven", "eight", "nine", "nine"));
        questions.add(new Question("7.What Mathematical symbol was determined by Whiz Ferdinand Von Lindemann 1882?", "e", "π", "µ", "£", "π"));
        questions.add(new Question("8.Sum of -5 and -6 is?", "-11", "11", "-1", "1", "-11"));
        //=//=//=//=//=//=//=//
        questions.add(new Question("1.The vitamin useful in alcoholism is...", "Folic acid", "Pyridoxine", "Thiamine", "Ascoribic acid", "Thiamine"));
        questions.add(new Question("2.The longest bone in human body is...", "Fibula", "Femur", "Stapes", "Tibia", "Femur"));
        questions.add(new Question("3.Which of the following is a vestigial organ?", "Centriole", "Diaphragm", "Appendix", "Molar teeth", "Appendix"));
        questions.add(new Question("4.Normal human blood is...", "Variable", "Acidic", "Neutral", "Alkaline", "Alkaline"));
        questions.add(new Question("5.Which of the following pairs has open type of circulatory system?", "Man and whale", "Tadpole larva and fish", "Cockroach and silverfish", "Earthworm and leech", "Cockroach and silverfish"));
        questions.add(new Question("6.Upper most layer of skin is called", "None of these", "Epidermis", "Protodermis", "Dermis", "Epidermis"));
        questions.add(new Question("7.Which one of the following is responsible for converting milk into curd?", "Bacteria", "Virus", "Fungi", "Yeast", "Bacteria"));
        questions.add(new Question("8.The scientist known as father of genetics is...", "Mandel", "Morrison", "Johnson", "Morgan", "Mandel"));
        //=//=//=//=//=//=//=//
        questions.add(new Question("1.A man presses more weight on earth at: ", "Sitting position", "Standing Position", "Lying Position", "None of these", "Standing Position"));
        questions.add(new Question("2.A piece of ice is dropped in a vesel containing kerosene. When ice melts, the level of kerosene will.", "Rise", "Fall", "Remain same", "None of these", "Fall"));
        questions.add(new Question("3.Young's modulus is the property of?", "Gas only", "Both Solid and Liquid", "Liquid only", "Solid only", "Solid only"));
        questions.add(new Question("4.An artificial Satellite revolves round the Earth in circular orbit, which quantity remains, constant?", "Angular Momentum", "Linear Velocity", "Angular Displacement", "None of these", "Angular Momentum"));
        questions.add(new Question("5.Product of Force and Velocity is called?", "Work", "Power", "Energy", "Momentum", "Power"));
        questions.add(new Question("6.Which one of the following has the highest value of specific heat?", "Alcohol", "Methane", "Kerosene", "Water", "Water"));
        questions.add(new Question("7.With the increase of pressure, the boiling point of any substance?", "Increases", "Decreases", "Remains Same", "Becomes zero", "Increases"));
        questions.add(new Question("8.What is the unit of Astronomical Distance?", "Light year", "Angstrom", "Weber", "Lux", "Light year"));
        //=//=//=//=//=//=//=//
        questions.add(new Question("1.Which of these countries has a border with Spain only?", "Andorra", "France", "Portugal", "Morocco", "Portugal"));
        questions.add(new Question("2.What is the name of this wonder of Australia?", "Sydney Opera House", "Sacre-Coeur Basilica", "Meenakishi Amman Temple", "Shwedagon Stupa", "Sydney Opera House"));
        questions.add(new Question("3.Where are we if we're on the largest of the Canary Islands?", "La Palma", "Lanzarote", "Gran Canaria", "Tenerife", "Tenerife"));
        questions.add(new Question("4.La Parva is a ski resort about thirty miles from what capital city?", "Lima, Peru", "La Paz, Bolivia", "Carcas, Venezuela", "Santiago, Chile", "Santiago, Chile"));
        questions.add(new Question("5.Christ The Redeemer Statue can be found in or near which of these locations?", "Houston", "Melbourne", "Rio de Janeiro", "Mexico City", "Rio de Janeiro"));
        questions.add(new Question("6.Which of these countries has the largest population?", "Brazil", "Russia", "Iran", "Germany", "Brazil"));
        questions.add(new Question("7.Which of these mountain ranges has the highest maximum elevation?", "Andes", "Alps", "Urals", "Rockies", "Andes"));
        questions.add(new Question("8.Which of these rivers flows past the most countries?", "Amazon", "Danube", "Mississipi", "Euphrates", "Danube"));
        //=//=//=//=//=//=//=//
        questions.add(new Question("1.What is the \"Great Red Spot\" on Jupiter?", "Alien settlement", "Mountain", "Huge storm", "Icecap", "Huge storm"));
        questions.add(new Question("2.Which planet is best known for its fabulous ring system?", "Mars", "Pluto", "Jupiter", "Saturn", "Saturn"));
        questions.add(new Question("3.Which of the following planets has no moons?", "Venus", "Earth", "Mars", "Jupiter", "Venus"));
        questions.add(new Question("4.How many planets are there in our Solar System?", "7", "10", "8", "9", "8"));
        questions.add(new Question("5.Which is the smallest planet in our Solar System?", "Mercury", "Venus", "Jupiter", "Pluto", "Mercury"));
        questions.add(new Question("6.What is the leading theory about how the universe began?", "Big Bang Theory", "Geocentrism", "Astrology", "Theory of General Relativity", "Big Bang Theory"));
        questions.add(new Question("7.Which planet is closest to the Sun?", "Venus", "Earth", "Pluto", "Mercury", "Mercury"));
        questions.add(new Question("8.Which is the largest planet in our Solar System?", "Neptune", "Sun", "Saturn", "Jupiter", "Jupiter"));
        //=//=//=//=//=//=//=//
        questions.add(new Question("1.There were many big trees, between me and the river and now they all fell down ... into the water.", "each other", "one after another", "one another", "a lot", "one another"));
        questions.add(new Question("2.I was given this watch ... my aunt.", "to", "from", "_", "by", "by"));
        questions.add(new Question("3.Where ... these shoes made?", "was", "were", "did", "is", "were"));
        questions.add(new Question("4.I'm really looking forward to ... my new course.", "start", "starting", "started", "start to", "starting"));
        questions.add(new Question("5.But I ... stay in England for six months, and not far a fortnight as I had planned.", "had to", "have to", "am able to", "can", "had to"));
        questions.add(new Question("6.The planet Mars ... as the \'Red Planet\'", "were known also", "does also known", "is also known", "as known", "is also known"));
        questions.add(new Question("7. ... a fluent speaker of English?", "Is her", "He", "Does she", "Is she", "Is she"));
        questions.add(new Question("8.Only ... of his friends came. Not all of them.", "some", "many", "few", "little", "some"));
        //=//=//=//=//=//=//=//
        questions.add(new Question("1.Havana", "Rwanda", "Bolivia", "Cuba", "New Zealand", "Cuba"));
        questions.add(new Question("2.Dili", "Qatar", "Iceland", "Latvia", "East Timor", "East Timor"));
        questions.add(new Question("3.Skopje", "Taiwan", "North Macedonia", "Tanzania", "Thailand", "North Macedonia"));
        questions.add(new Question("4.Madrid", "Liberia", "Comoros", "Spain", "Yemen", "Spain"));
        questions.add(new Question("5.Bangkok", "Greece", "Thailand", "Bahrain", "North Korea", "Thailand"));
        questions.add(new Question("6.Paramaribo", "Honduras", "The Bahamas", "Suriname", "Cambodia", "Cambodia"));
        questions.add(new Question("7.Bandar Seri Begawan", "Angola", "Netherlands", "Ireland", "Brunei", "Brunei"));
        questions.add(new Question("8.Beirut", "United Kingdom", "Guatemala", "Portugal", "Lebanon", "Lebanon"));
    }


    @Override
    public Question getQuestion(int index) {
        return questions.get(index);
    }

    @Override
    public int getQuestionCount() {
        return questions.size();
    }
}
