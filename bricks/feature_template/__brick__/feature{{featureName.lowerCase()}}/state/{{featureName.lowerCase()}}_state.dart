import 'package:riverpod_annotation/riverpod_annotation.dart';

part '{{featureName.lowerCase()}}_state.g.dart';

@Riverpod(keepAlive: false)
class {{featureName.pascalCase()}} extends _${{featureName.pascalCase()}} {
  @override
  FutureOr<void> build() {}

  Future<void> {{featureName.lowerCase()}}() async {}
}