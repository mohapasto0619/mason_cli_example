import 'package:riverpod_annotation/riverpod_annotation.dart';

part 'login_state.g.dart';

@Riverpod(keepAlive: false)
class Login extends _$Login {
  @override
  FutureOr<void> build() {}

  Future<void> login() async {}
}