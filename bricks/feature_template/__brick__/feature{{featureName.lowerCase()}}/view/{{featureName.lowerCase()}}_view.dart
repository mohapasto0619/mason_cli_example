import 'package:flutter/material.dart';

class {{featureName.pascalCase()}}View extends StatelessWidget {

  const {{featureName.pascalCase()}}View({
    super.key,
  });

  @override
  Widget build(BuildContext context) {
    return const Scaffold(
      body: Center(
        child: Text(
          "{{featureName.pascalCase()}}",
        ),
      ),
    );
  }
}