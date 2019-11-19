import React, { Component }  from 'react';
import { StyleSheet, Text, View,TextInput,Button} from 'react-native';


export default class App extends React.Component {

  constructor(){
    super()
    this.state = {
      value: null,
    }
  }

  _handlePress() {
    console.log(this.state.value);
//fetch('http://192.168.0.104:9944/add/test',  { //ip address of your system and app should be run on same neetwork
fetch('http://218.39.221.69:9090/add/test', {    //ip address of your system and app should be run on same neetwork
  method: 'POST',
  headers: {
    Accept: 'application/json',
    'Content-Type': 'application/json',
  },
  body: JSON.stringify({
    "name": this.state.value
  }),
}).then((response) => response.json())
    .then((responseJson) => {
      return responseJson;
    })
    .catch((error) => {
      console.error(error);
    });
 }

 onChangeText = (value) => {
  this.setState({ value });
}


 render() {
  return (
    <View style={styles.container}>
      <Text>Open up App.js to start working on your app!</Text>

      <TextInput
          style={styles.textInputStyle}
          placeholder="Enter Value"
          onChangeText={this.onChangeText}
          value={this.state.value}
        />

      <Button 
          onPress={() => this._handlePress()}
          style={styles.buttonStyle} title="Press Me">
        </Button>
    </View>
  );
 }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
