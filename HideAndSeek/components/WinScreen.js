import React from 'react';
import {
  Text,
  View,
} from 'react-vr';

export default class WinScreen extends React.Component {
  render() {
    return (
      <View>
        <Text style={{color: 'yellow', fontWeight: 600, textAlign: 'center'}}>
          Congratulations !
        </Text>
      </View>
    )
  }

}
